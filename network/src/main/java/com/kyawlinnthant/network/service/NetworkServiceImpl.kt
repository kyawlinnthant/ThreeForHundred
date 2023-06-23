package com.kyawlinnthant.network.service

import com.kyawlinnthant.network.QuoteApi
import com.kyawlinnthant.network.DataResult
import com.kyawlinnthant.network.QuoteDTO
import com.kyawlinnthant.network.safeApiCall
import javax.inject.Inject

class NetworkServiceImpl @Inject constructor(
    private val api : QuoteApi
) : NetworkService{
    override suspend fun fetchRandomQuote(): DataResult<List<QuoteDTO>> {
        return safeApiCall {
            api.fetchRandomQuote()
        }
    }
}