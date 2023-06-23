package com.kyawlinnthant.threeforhundred.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kyawlinnthant.threeforhundred.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val repo: Repository
) : ViewModel() {

    private val vmState = MutableStateFlow(ListViewModelState())
    val quotes = vmState
        .map(ListViewModelState::uiQuotes)
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = vmState.value.uiQuotes()
        )

    fun getQuotes() {
        viewModelScope.launch {
            repo.getQuotes().collect { quotes ->
                vmState.update {
                    it.copy(
                        quotes = quotes
                    )
                }
            }
        }
    }
}