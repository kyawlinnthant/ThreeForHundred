package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeUiEmpty(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(24.dp),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Empty")
    }
}