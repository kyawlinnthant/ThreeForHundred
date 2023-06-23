package com.kyawlinnthant.threeforhundred.presentation.home

sealed interface HomeAction {
    object GoToList : HomeAction
    object RequestNext : HomeAction
}