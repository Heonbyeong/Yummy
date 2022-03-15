package com.example.yummy.util

import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ShowBar(flag : Boolean){
    rememberSystemUiController().apply {
        this.isSystemBarsVisible = flag
        this.isNavigationBarVisible = flag
        this.isStatusBarVisible = flag
    }
}