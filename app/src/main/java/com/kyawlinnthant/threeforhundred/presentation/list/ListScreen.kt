package com.kyawlinnthant.threeforhundred.presentation.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kyawlinnthant.model.Quote

@Composable
fun ListScreen(quotes: List<Quote>) {
    Scaffold {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
        ) {
            items(items = quotes) { quote ->
                ListItem(quote = quote)
            }
        }
    }
}