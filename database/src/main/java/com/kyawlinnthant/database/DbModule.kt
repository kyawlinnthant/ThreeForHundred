package com.kyawlinnthant.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbModule {
    @Provides
    @Singleton
    fun provideDb(
        @ApplicationContext context: Context
    ): QuoteDatabase = Room
        .databaseBuilder(
            context,
            QuoteDatabase::class.java,
            QuoteDatabase.DB_NAME
        )
        .fallbackToDestructiveMigration()
        .build()

    @Provides
    @Singleton
    fun provideDao(db: QuoteDatabase): QuoteDao = db.dao()
}