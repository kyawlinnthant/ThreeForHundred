package com.kyawlinnthant.threeforhundred.presentation.common

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.KeyframesSpec
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kyawlinnthant.theme.ThreeForHundredTheme
import kotlinx.coroutines.delay

@Composable
fun LoadingAnimation(
    modifier: Modifier = Modifier,
    circleSize: Dp = 16.dp,
    circleColor: Color = MaterialTheme.colorScheme.primary,
    spaceBetween: Dp = 10.dp,
    travelDistance: Dp = 20.dp,
    delayBetween : Long = 100L,
    durationMilli : Int = 1200,
    bounceDelayOne : Int = 300,
    bounceDelayTwo : Int = 600,
    bounceDelayThree : Int = 1200,
    keyframe : KeyframesSpec<Float> = keyframes {
        durationMillis = durationMilli
        0.0f at 0 with LinearOutSlowInEasing
        1.0f at bounceDelayOne with LinearOutSlowInEasing
        0.0f at bounceDelayTwo with LinearOutSlowInEasing
        0.0f at bounceDelayThree with LinearOutSlowInEasing
    },
) {
    val circles = listOf(
        remember { Animatable(initialValue = 0f) },
        remember { Animatable(initialValue = 0f) },
        remember { Animatable(initialValue = 0f) }
    )


    circles.forEachIndexed { index, animated ->
        LaunchedEffect(key1 = animated) {
            delay(index * delayBetween)
            animated.animateTo(
                targetValue = 1f,
                animationSpec = infiniteRepeatable(
                    animation = keyframe,
                    repeatMode = RepeatMode.Restart
                )
            )
        }
    }

    val circleValues = circles.map { it.value }
    val distance = with(LocalDensity.current) { travelDistance.toPx() }

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        circleValues.forEach { value ->
            Box(
                modifier = Modifier
                    .size(circleSize)
                    .graphicsLayer {
                        translationY = -value * distance
                    }
                    .background(
                        color = circleColor,
                        shape = CircleShape
                    )
            )
        }
    }
}

@Composable
@Preview
private fun LoadingAnimationPreview() {
    ThreeForHundredTheme {
        Surface {
            LoadingAnimation()
        }
    }
}