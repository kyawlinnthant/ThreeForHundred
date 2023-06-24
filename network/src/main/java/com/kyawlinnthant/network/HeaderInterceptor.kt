package com.kyawlinnthant.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class HeaderInterceptor @Inject constructor() : Interceptor {
    companion object {
        const val HOST_KEY_NAME = "X-RapidAPI-Host"
        const val API_KEY_NAME = "X-RapidAPI-Key"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()
        requestBuilder.apply {
            addHeader(
                HOST_KEY_NAME,
                BuildConfig.HOST_KEY
            )
            addHeader(
                API_KEY_NAME,
                BuildConfig.API_KEY
            )
        }
        return chain.proceed(requestBuilder.build())
    }
}