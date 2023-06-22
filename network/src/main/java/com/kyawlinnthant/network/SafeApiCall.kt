package com.kyawlinnthant.network

import retrofit2.Response

inline fun <reified T> safeApiCall(
    apiCall: () -> Response<T>
): DataResult<T> {
    try {
        val response = apiCall()
        // [200..300]
        if (response.isSuccessful) {
            val body = response.body() ?: return DataResult.Fail("Empty body")
            return DataResult.Success(body)
        }
        //this will be [400..500]
        return DataResult.Fail(response.message())
    } catch (e: Exception) {
        //this will be JsonParsing or something throws exception
        return DataResult.Fail(e.localizedMessage ?: "Something's Wrong!")
    }
}