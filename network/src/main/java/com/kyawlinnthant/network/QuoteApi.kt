package com.kyawlinnthant.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApi {

    companion object {
        const val RANDOM = "random"
        private const val DEFAULT_CATEGORY = "all"
        private const val DEFAULT_COUNT = 1
    }

    @GET(RANDOM)
    suspend fun fetchRandomQuote(
        @Query("category") category: String = DEFAULT_CATEGORY,
        @Query("count") count: Int = DEFAULT_COUNT
    ): Response<List<QuoteDTO>>
}