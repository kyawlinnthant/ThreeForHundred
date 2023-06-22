package com.kyawlinnthant.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface QuoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuote(quote: QuoteEntity)

    @Query("SELECT * FROM ${QuoteEntity.TABLE_NAME}")
    fun queryQuotes() : Flow<List<QuoteEntity>>
}