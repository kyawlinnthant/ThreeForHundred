package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeUiError(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    message: String,
    onRetry: () -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = message)
        Spacer(modifier = modifier.height(24.dp))
        OutlinedButton(onClick = onRetry) {
            Text(text = "Retry")
        }
    }
}