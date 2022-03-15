package com.example.yummy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.yummy.ui.theme.YummyTheme
import com.example.yummy.ui.theme.primary
import com.example.yummy.ui.theme.secondary
import com.example.yummy.ui.theme.white

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            YummyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = secondary
                ) {
                    SplashScreen()
                }
            }
        }
    }
}

@Composable
fun SplashScreen() {
    val multicore_font = FontFamily(
        Font(R.font.multicore_pro, FontWeight.Normal)
    )
    val noto_sans_font = FontFamily(
        Font(R.font.noto_sans_kr_medium)
    )

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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YummyTheme {
        //Greeting("Android")
    }
}