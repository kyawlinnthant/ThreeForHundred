package com.kyawlinnthant.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kyawlinnthant.database.QuoteEntity.Companion.TABLE_NAME
import com.kyawlinnthant.model.Quote

@Entity(tableName = TABLE_NAME)
data class QuoteEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val text: String,
    val author: String,
    val category: String
) {
    companion object {
        const val TABLE_NAME = "quote"
    }

    fun toVo() = Quote(
        id = id,
        text = text,
        author = author,
        category = category
    )
}

fun Quote.toEntity() = QuoteEntity(
    id = this.id,
    text = this.text,
    author = this.author,
    category = this.category
)