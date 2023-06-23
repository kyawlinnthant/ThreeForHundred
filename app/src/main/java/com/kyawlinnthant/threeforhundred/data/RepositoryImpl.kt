package com.kyawlinnthant.threeforhundred.data

import com.kyawlinnthant.database.QuoteDao
import com.kyawlinnthant.database.toEntity
import com.kyawlinnthant.dispatchers.DispatchersModule
import com.kyawlinnthant.model.Quote
import com.kyawlinnthant.network.QuoteApi
import com.kyawlinnthant.network.DataResult
import com.kyawlinnthant.network.safeApiCall
import com.kyawlinnthant.threeforhundred.domain.Repository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: QuoteApi,
    private val dao: QuoteDao,
    @DispatchersModule.IO private val io: CoroutineDispatcher,
) : Repository {
    override suspend fun getRandomQuote(): DataResult<Quote> {
        return withContext(io) {
            val networkRequest = safeApiCall {
                api.fetchRandomQuote()
            }
            when (networkRequest) {
                is DataResult.Fail -> {
                    val fromDb = getRandomQuoteFromDb()
                    fromDb?.let {
                        DataResult.Success(data = it)
                    } ?: kotlin.run {
                        DataResult.Fail(message = networkRequest.message)
                    }
                }

                is DataResult.Success -> {
                    dao.insertQuote(networkRequest.data.first().toVo().toEntity())
                    DataResult.Success(data = networkRequest.data.first().toVo())
                }
            }
        }
    }

    override suspend fun getInitialQuote(): Quote {
        return dao.queryQuotes().flowOn(io).firstOrNull()?.randomOrNull()?.toVo() ?: Quote()
    }

    private suspend fun getRandomQuoteFromDb(): Quote? {
        return dao.queryQuotes().firstOrNull()?.randomOrNull()?.toVo()
    }

    override suspend fun getQuotes(): Flow<List<Quote>> {
        return dao.queryQuotes().map {
            it.map { entity ->
                entity.toVo()
            }
        }.flowOn(io)
    }
}