package com.kyawlinnthant.threeforhundred.domain

import com.kyawlinnthant.model.Quote
import com.kyawlinnthant.network.DataResult
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun getRandomQuote(): DataResult<Quote>
    suspend fun getInitialQuote(): Quote
    suspend fun getQuotes(): Flow<List<Quote>>
}