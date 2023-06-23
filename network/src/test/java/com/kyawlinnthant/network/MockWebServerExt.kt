package com.kyawlinnthant.network

import com.kyawlinnthant.network.NetworkModule.provideClient
import com.kyawlinnthant.network.NetworkModule.provideRetrofit
import com.kyawlinnthant.network.NetworkModule.provideService
import okhttp3.mockwebserver.MockWebServer

fun MockWebServer.toQuoteApi() : QuoteApi{
    val retrofitBuilder = provideRetrofit(
        client = provideClient(),
        baseUrl = url("").toString()
    )
    return provideService(retrofitBuilder)
}