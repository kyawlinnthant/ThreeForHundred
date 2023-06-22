package com.kyawlinnthant.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor @Inject constructor(): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.apply {
            addHeader(
                "X-RapidAPI-Host",
                "famous-quotes4.p.rapidapi.com"
            )
            addHeader(
                "X-RapidAPI-Key",
                "abcdefg"
            )
        }
        return chain.proceed(requestBuilder.build())
    }
}