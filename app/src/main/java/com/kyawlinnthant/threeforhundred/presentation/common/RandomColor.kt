package com.kyawlinnthant.threeforhundred.presentation.common

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun randomColor(): Color {
    val random = Random.Default
    return Color(
        red = random.nextFloat(),
        green = random.nextFloat(),
        blue = random.nextFloat(),
        alpha = 0.3f,
    )
}