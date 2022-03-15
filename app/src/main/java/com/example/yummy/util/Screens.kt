package com.example.yummy.util

sealed class Screens(val route: String){
    object main : Screens("Main")
    object splash : Screens("Splash")
}
