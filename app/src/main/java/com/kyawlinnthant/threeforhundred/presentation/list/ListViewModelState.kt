package com.kyawlinnthant.threeforhundred.presentation.list

import com.kyawlinnthant.model.Quote

data class ListViewModelState(
    val quotes: List<Quote> = emptyList(),
) {
    fun uiQuotes() = quotes
}