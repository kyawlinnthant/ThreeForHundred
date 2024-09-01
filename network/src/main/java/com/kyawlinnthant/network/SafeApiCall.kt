package com.kyawlinnthant.network

import android.util.Log
import retrofit2.Response

inline fun <reified T> safeApiCall(
    apiCall: () -> Response<T>
): DataResult<T> {
    try {
        val response = apiCall()
        Log.d("linn.res", "Raw JSON Response: $response")

        // [200..300]
        if (response.isSuccessful) {
            val responseBody = response.body()
            Log.d("linn.body", "Raw JSON Response: $responseBody")
            val body = responseBody ?: return DataResult.Fail("Empty body")
            return DataResult.Success(body)
        }
        // this will be [400..500]
        return DataResult.Fail(response.message())
    } catch (e: Exception) {
        Log.d("linn","$e")
        // this will be JsonParsing or something throws exception
        return DataResult.Fail(e.localizedMessage ?: "Something's Wrong!")
    }
}