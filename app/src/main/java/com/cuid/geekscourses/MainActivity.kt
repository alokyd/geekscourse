package com.cuid.geekscourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.cuid.geekscourses.ui.HomeScreen
import com.cuid.geekscourses.ui.theme.Geekscourse

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Geekscourse{
                HomeScreen()
            }
        }
    }
}