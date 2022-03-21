package com.example.yummy.view.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.yummy.R
import com.example.yummy.ui.theme.primary
import com.example.yummy.ui.theme.secondary
import com.example.yummy.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    val multicore_font = FontFamily(
        Font(R.font.multicore_pro, FontWeight.Normal)
    )
    val noto_sans_font = FontFamily(
        Font(R.font.noto_sans_kr_medium)
    )
    LaunchedEffect(key1 = true) {
        delay(2500)
        navController.navigate("main_screen")
    }
    Box(
        modifier = Modifier
            .background(secondary)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Yummy",
                fontFamily = multicore_font,
                fontSize = 30.sp,
                color = primary,
            )
            Text(
                "대한민국 1등 음식점 추천 어플",
                fontFamily = noto_sans_font,
                fontSize = 14.sp,
                color = white
            )
        }
    }
}