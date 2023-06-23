package com.kyawlinnthant.threeforhundred.presentation.home

import com.kyawlinnthant.model.Quote

data class HomeViewModelState(
    val quote: Quote = Quote(),
    val error: String = "",
    val isLoading : Boolean = false
) {
    fun asUiState() : HomeUiState = when {
        quote == Quote() && error.isEmpty() -> HomeUiState.Loading
        quote == Quote() && error.isNotEmpty() -> HomeUiState.NoDataError(error = error)
        quote != Quote() && error.isEmpty() -> HomeUiState.HasData(quote = quote)
        else -> HomeUiState.Empty
    }
    fun asLoading() = isLoading
}
