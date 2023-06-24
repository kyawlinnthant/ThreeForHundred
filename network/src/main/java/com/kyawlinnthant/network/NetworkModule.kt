package com.kyawlinnthant.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.localebro.okhttpprofiler.OkHttpProfilerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Retention(AnnotationRetention.BINARY)
    annotation class BASEURL

    @Retention(AnnotationRetention.BINARY)
    annotation class HEADER

    @BASEURL
    @Singleton
    @Provides
    fun provideBaseUrl(): String = BuildConfig.BASE_URL

    @HEADER
    @Singleton
    @Provides
    fun provideHeaderInterceptor(header: HeaderInterceptor): Interceptor = header

    @Provides
    @Singleton
    fun provideClient(
        @HEADER header: HeaderInterceptor
    ): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(OkHttpProfilerInterceptor())
        .addInterceptor(header)
        .build()

    @Provides
    @Singleton
    fun provideConverterFactory(): Converter.Factory =
        Json.asConverterFactory("application/json".toMediaType())

    @Provides
    @Singleton
    fun provideRetrofit(
        client: OkHttpClient,
        @BASEURL baseUrl: String,
        factory: Converter.Factory
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(factory)
        .build()

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): QuoteApi = retrofit.create(QuoteApi::class.java)
}