package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kyawlinnthant.threeforhundred.R

@Composable
fun HomeScreen(
    state: HomeUiState,
    isLoading : Boolean,
    onAction: (HomeAction) -> Unit,
) {

    Scaffold {
        Column(
            modifier = Modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(modifier = Modifier
                .fillMaxSize()
                .weight(1f), contentAlignment = Alignment.Center) {
                when (state) {
                    HomeUiState.Loading -> Text(text = "loading")
                    HomeUiState.Empty -> Text(text = "empty")
                    is HomeUiState.HasData -> Text(text = state.quote.text,modifier = Modifier.fillMaxWidth().padding(12.dp))
                    is HomeUiState.NoDataError -> Text(text = state.error)
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedIconButton(onClick = { onAction(HomeAction.GoToList) }) {
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_playlist_play_24),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
                OutlinedButton(onClick = { onAction(HomeAction.RequestNext) }, enabled = !isLoading) {
                    Text(text = "Request Next")
                }
            }
        }


    }
}