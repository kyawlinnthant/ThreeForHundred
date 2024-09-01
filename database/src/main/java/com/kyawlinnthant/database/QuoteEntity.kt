package com.kyawlinnthant.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kyawlinnthant.database.QuoteEntity.Companion.TABLE_NAME
import com.kyawlinnthant.model.Quote

@Entity(tableName = TABLE_NAME)
data class QuoteEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val content: String,
    val author: String,
    val authorSlug: String,
    val length: Int,
    val tag: List<String>
) {
    companion object {
        const val TABLE_NAME = "quote"
    }

    fun toVo() = Quote(
        id = id,
        content = content,
        author = author,
        authorSlug = authorSlug,
        length = length,
        tag = tag
    )
}

fun Quote.toEntity() = QuoteEntity(
    id = this.id,
    content = this.content,
    author = this.author,
    authorSlug = this.authorSlug,
    length = this.length,
    tag = this.tag
)
