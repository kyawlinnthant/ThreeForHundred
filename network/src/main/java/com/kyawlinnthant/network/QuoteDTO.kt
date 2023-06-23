package com.kyawlinnthant.network

import com.kyawlinnthant.model.Quote
import kotlinx.serialization.Serializable

@Serializable
data class QuoteDTO(
    val id: Int,
    val text: String,
    val author: String,
    val category: String
) {
    fun toVo() = Quote(
        id = id,
        text = text,
        author = author,
        category = category
    )
}