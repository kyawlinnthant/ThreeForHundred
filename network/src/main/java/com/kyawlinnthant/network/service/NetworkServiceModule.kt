package com.kyawlinnthant.network.service

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface NetworkServiceModule {
    @Binds
    @Singleton
    fun bindNetworkService(service: NetworkServiceImpl): NetworkService
}