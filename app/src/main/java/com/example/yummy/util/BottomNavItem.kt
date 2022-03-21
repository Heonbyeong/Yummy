package com.example.yummy.util

import com.example.yummy.R

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object Home: BottomNavItem("Home", R.drawable.ic_home, "home")
    object Recommend: BottomNavItem("Recommend", R.drawable.ic_recommend, "recommend")
}
