package com.kyawlinnthant.threeforhundred.presentation.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kyawlinnthant.model.Quote
import com.kyawlinnthant.theme.ThreeForHundredTheme
import com.kyawlinnthant.threeforhundred.presentation.common.randomColor

@Composable
fun ListItem(
    modifier: Modifier = Modifier,
    quote: Quote,
    authorBgAlpha: Float = 0.15f,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = quote.text,
            modifier = modifier.fillMaxWidth(),
        )
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Text(
                text = "#${quote.category}",
                style = MaterialTheme.typography.labelSmall,
                modifier = modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(color = randomColor())
                    .padding(horizontal = 4.dp),
            )
            Spacer(modifier = modifier.width(8.dp))
            Text(
                text = quote.author,
                style = MaterialTheme.typography.labelMedium,
                modifier = modifier
                    .clip(RoundedCornerShape(4.dp))
                    .background(color = MaterialTheme.colorScheme.onSurface.copy(authorBgAlpha))
                    .padding(horizontal = 4.dp),
            )
        }
    }
}

@Composable
@Preview
private fun ListItemPreview() {
    ThreeForHundredTheme {
        Surface {
            ListItem(
                quote = Quote(
                    id = 1,
                    text = "I know of no more important subject to the peace of Europe and the world than the reasonable reduction of armaments, especially in Europe.",
                    author = "Emil Zatopek",
                    category = "fitness",
                ),
            )
        }
    }
}