package com.kyawlinnthant.database
import androidx.room.TypeConverter
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class TagConverter {

    @TypeConverter
    fun fromString(value: String): List<String> {
        return Json.decodeFromString(value)
    }

    @TypeConverter
    fun fromList(list: List<String>): String {
        return Json.encodeToString(list)
    }
}