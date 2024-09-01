package com.kyawlinnthant.threeforhundred.presentation.home

import com.kyawlinnthant.model.Quote

data class HomeViewModelState(
    val quote: Quote = Quote.createEmpty(),
    val error: String = "",
    val isLoading: Boolean = false,
) {
    fun asUiState(): HomeUiState = when {
        quote == Quote.createEmpty() && error.isEmpty() -> HomeUiState.Loading
        quote == Quote.createEmpty() && error.isNotEmpty() -> HomeUiState.NoDataError(error = error)
        quote != Quote.createEmpty() && error.isEmpty() -> HomeUiState.HasData(
            quote = quote,
            isLoading = isLoading,
        )

        else -> HomeUiState.Empty
    }
}