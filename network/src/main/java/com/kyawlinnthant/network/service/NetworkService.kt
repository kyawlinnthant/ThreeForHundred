package com.kyawlinnthant.network.service

import com.kyawlinnthant.network.DataResult
import com.kyawlinnthant.network.QuoteDTO

interface NetworkService {
    suspend fun fetchRandomQuote() : DataResult<List<QuoteDTO>>
}