package com.kyawlinnthant.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(
    entities = [QuoteEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(TagConverter::class)
abstract class QuoteDatabase : RoomDatabase() {
    abstract fun dao(): QuoteDao

    companion object {
        const val DB_NAME = "quotedb"
    }
}