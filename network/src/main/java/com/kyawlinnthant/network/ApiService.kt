package com.kyawlinnthant.network

import com.kyawlinnthant.model.RandomQuote
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    companion object {
        const val RANDOM = "random"
    }

    @GET(RANDOM)
    suspend fun fetchRandomQuote(
        @Query("category") category: String = "all",
        @Query("count") count: Int = 1,
    ): Response<List<RandomQuote>>
}