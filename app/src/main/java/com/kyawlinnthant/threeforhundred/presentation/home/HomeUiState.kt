package com.kyawlinnthant.threeforhundred.presentation.home

import com.kyawlinnthant.model.Quote

sealed interface HomeUiState {
    object Loading : HomeUiState
    data class NoDataError(val error: String): HomeUiState
    object Empty : HomeUiState
    data class HasData(val quote: Quote) : HomeUiState
}