package com.kyawlinnthant.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [DbModule::class]
)
object TestDbModule {
    @Provides
    @Singleton
    fun provideInMemoryDb(
        @ApplicationContext context: Context
    ): QuoteDatabase = Room.inMemoryDatabaseBuilder(
        context,
        QuoteDatabase::class.java
    ).allowMainThreadQueries().build()
}