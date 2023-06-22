package com.kyawlinnthant.threeforhundred.di

import com.kyawlinnthant.threeforhundred.data.RepositoryImpl
import com.kyawlinnthant.threeforhundred.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepoModule {
    @Binds
    @Singleton
    fun bindRepo(repo: RepositoryImpl): Repository
}