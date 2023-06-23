package com.kyawlinnthant.threeforhundred.presentation.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kyawlinnthant.model.Quote
import com.kyawlinnthant.theme.ThreeForHundredTheme
import com.kyawlinnthant.threeforhundred.R
import com.kyawlinnthant.threeforhundred.presentation.common.randomColor

@Composable
fun HomeUiData(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    quote: Quote,
    onNavigateList: () -> Unit,
    onRequestNext: () -> Unit,
    isLoading: Boolean,
    categoryBgAlpha: Float = 0.5f
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = quote.text,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                style = MaterialTheme.typography.titleLarge,
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "#${quote.category}",
                    style = MaterialTheme.typography.labelSmall,
                    modifier = modifier
                        .clip(RoundedCornerShape(4.dp))
                        .background(color = randomColor())
                        .padding(horizontal = 4.dp),
                )
                Text(text = quote.author, style = MaterialTheme.typography.labelLarge)
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            OutlinedIconButton(
                onClick = onNavigateList,
                colors = IconButtonDefaults.outlinedIconButtonColors(
                    contentColor = MaterialTheme.colorScheme.onSurface.copy(categoryBgAlpha),
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.onSurface.copy(categoryBgAlpha)
                ),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_playlist_play_24),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface,
                )
            }
            OutlinedButton(onClick = onRequestNext, enabled = !isLoading) {
                Text(text = "Request Next")
            }
        }
    }
}

@Composable
@Preview
private fun HasDataPreview() {
    ThreeForHundredTheme {
        Surface {
            HomeUiData(
                paddingValues = PaddingValues(),
                quote = Quote(
                    id = 1,
                    text = "I know of no more important subject to the peace of Europe and the world than the reasonable reduction of armaments, especially in Europe.",
                    author = "Emil Zatopek",
                    category = "fitness",
                ),
                onNavigateList = { },
                onRequestNext = { },
                isLoading = false,
            )
        }
    }
}