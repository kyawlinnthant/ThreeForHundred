package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kyawlinnthant.navigation.AppNavigator
import com.kyawlinnthant.network.DataResult
import com.kyawlinnthant.threeforhundred.domain.Repository
import com.kyawlinnthant.threeforhundred.presentation.common.Constant
import com.kyawlinnthant.threeforhundred.presentation.main.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: Repository,
    private val navigator: AppNavigator,
) : ViewModel() {

    private val vmState = MutableStateFlow(HomeViewModelState())
    val uiState = vmState
        .map(HomeViewModelState::asUiState)
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = vmState.value.asUiState(),
        )

    private fun requestNewQuote() {
        vmState.update {
            it.copy(
                isLoading = true,
                error = "",
            )
        }
        getRandomQuote()
    }

    private fun retryRequest() {
        vmState.update {
            it.copy(
                isLoading = true,
                error = "",
            )
        }
        viewModelScope.launch {
            delay(Constant.DEFAULT_DELAY)
            getRandomQuote()
        }
    }

    fun getRandomQuote() {
        viewModelScope.launch {
            repo.getRandomQuote().also { result ->

                when (result) {
                    is DataResult.Fail -> {
                        vmState.update {
                            it.copy(
                                error = result.message,
                            )
                        }
                    }

                    is DataResult.Success -> {
                        vmState.update {
                            it.copy(
                                error = "",
                                quote = result.data,
                            )
                        }
                    }
                }
                vmState.update {
                    it.copy(
                        isLoading = false,
                    )
                }
            }
        }
    }

    fun getInitialQuote() {
        viewModelScope.launch {
            repo.getInitialQuote().also { quote ->
                vmState.update {
                    it.copy(quote = quote)
                }
            }
        }
    }

    fun onAction(action: HomeAction) {
        when (action) {
            HomeAction.GoToList -> navigator.to(route = Screen.List.route)
            HomeAction.RequestNext -> requestNewQuote()
            HomeAction.Retry -> retryRequest()
        }
    }
}