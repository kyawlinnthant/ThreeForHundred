package com.kyawlinnthant.network

import com.kyawlinnthant.model.Quote
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class QuoteDTO(
    @SerialName(value = "_id")
    val id: String,
    val content: String,
    val author: String,
    val authorSlug: String,
    val length: Int,
    val tags: List<String>,
    val dateAdded : String,
    val dateModified : String,
) {
    fun toVo() = Quote(
        id = id,
        content = content,
        author = author,
        authorSlug = authorSlug,
        length = length,
        tag = tags
    )
}
