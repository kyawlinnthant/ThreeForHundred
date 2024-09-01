package com.kyawlinnthant.model

data class Quote(
    val id: String,
    val content: String,
    val author: String,
    val authorSlug: String,
    val length: Int,
    val tag: List<String>,
) {
    companion object {
        fun createEmpty() = Quote(
            id = "",
            content = "",
            author = "",
            authorSlug = "",
            length = 0,
            tag = emptyList(),
        )
    }
}