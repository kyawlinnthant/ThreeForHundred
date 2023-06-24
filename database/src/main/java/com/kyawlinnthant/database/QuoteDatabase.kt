package com.kyawlinnthant.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [QuoteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun dao(): QuoteDao

    companion object {
        const val DB_NAME = "quotedb"
    }
}