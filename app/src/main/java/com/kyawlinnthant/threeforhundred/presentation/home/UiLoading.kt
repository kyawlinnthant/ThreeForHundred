package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kyawlinnthant.threeforhundred.presentation.common.LoadingAnimation

@Composable
fun HomeUiLoading(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues),
        contentAlignment = Alignment.Center,
    ) {
        LoadingAnimation()
    }
}