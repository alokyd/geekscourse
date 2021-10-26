package com.cuid.geekscourses

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Course(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
