package com.kyawlinnthant.threeforhundred.presentation.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kyawlinnthant.model.Quote

@Composable
fun ListScreen(quotes: List<Quote>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = quotes) {
            Text(text = it.text, modifier = Modifier.fillMaxWidth().padding(12.dp))
        }
    }
}