package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    state: HomeUiState,
    onAction: (HomeAction) -> Unit,
) {
    Scaffold {
        when (state) {
            HomeUiState.Empty -> HomeUiEmpty(paddingValues = it)
            is HomeUiState.HasData -> HomeUiData(
                paddingValues = it,
                quote = state.quote,
                onNavigateList = { onAction(HomeAction.GoToList) },
                onRequestNext = { onAction(HomeAction.RequestNext) },
                isLoading = state.isLoading,
            )

            HomeUiState.Loading -> HomeUiLoading(paddingValues = it)
            is HomeUiState.NoDataError -> HomeUiError(
                paddingValues = it,
                message = state.error,
                onRetry = { onAction(HomeAction.Retry) },
            )
        }
    }
}