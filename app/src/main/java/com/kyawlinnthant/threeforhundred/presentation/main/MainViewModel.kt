package com.kyawlinnthant.threeforhundred.presentation.main

import androidx.lifecycle.ViewModel
import com.kyawlinnthant.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val appNavigator: AppNavigator
) : ViewModel()