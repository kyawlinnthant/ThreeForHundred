package com.kyawlinnthant.network

import com.kyawlinnthant.network.NetworkModule.provideConverterFactory
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import java.net.HttpURLConnection

@OptIn(ExperimentalCoroutinesApi::class)
class NetworkServiceTest {
    private lateinit var mockWebServer: MockWebServer
    private lateinit var service: QuoteApi

    @Before
    fun setup() {
        mockWebServer = MockWebServer()
        mockWebServer.start()
        service = Retrofit
            .Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(provideConverterFactory())
            .build()
            .create(QuoteApi::class.java)
    }

    @After
    fun teardown() {
        mockWebServer.shutdown()
    }

    private fun enqueueResponse(filename: String): String {
        val inputStream = javaClass.classLoader!!.getResourceAsStream(filename)
        val source = inputStream.source().buffer()
        return source.readString(Charsets.UTF_8)
    }

    @Test
    fun `verify fetch random quote request`() = runTest {
        val fakeQuotes = listOf(
            QuoteDTO(
                author = "Sidney Blumenthal",
                text = "On health care, virtually every political error that could be made was made.",
                category = "health",
                id = 33643
            )
        )
        val bodyResponse = Json.encodeToString(fakeQuotes)
        val mockResponse = MockResponse().setBody(bodyResponse)
        mockWebServer.enqueue(response = mockResponse)
        service.fetchRandomQuote()
        val request = mockWebServer.takeRequest()
        val requestUrl = request.requestUrl!!
        assertEquals("GET", request.method)
        assertEquals(QuoteApi.RANDOM, requestUrl.encodedPath)
    }

    @Test
    fun `verify fetch random quote response`() = runTest {
        val mockBody = enqueueResponse("json/random_quote.json")
        val expected = Json.decodeFromString<List<QuoteDTO>>(mockBody)
        val mockResponse = MockResponse().setBody(mockBody)
        mockWebServer.enqueue(mockResponse)

        val actual = service.fetchRandomQuote()
        val actualCode = actual.code()
        val actualBody = actual.body()

        assertEquals(HttpURLConnection.HTTP_OK, actualCode)
        assertEquals(expected, actualBody)
    }

    @Test(expected = Exception::class)
    fun `malformed json throws exception`() = runTest {
        val mockRequest = enqueueResponse("json/malformed.json")
        val mockResponse = MockResponse().setBody(mockRequest)
        mockWebServer.enqueue(mockResponse)
        service.fetchRandomQuote()
    }
}