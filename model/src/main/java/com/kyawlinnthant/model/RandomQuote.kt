package com.kyawlinnthant.model

import kotlinx.serialization.Serializable

@Serializable
data class RandomQuote(
    val id: Long,
    val text: String,
    val author: String,
    val category: String
)