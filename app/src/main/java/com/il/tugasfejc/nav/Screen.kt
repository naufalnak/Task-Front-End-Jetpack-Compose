package com.il.tugasfejc.nav

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Gallery: Screen("gallery")
    data object Profil: Screen("profil")
    data object DetailMent: Screen("detail_tayang")
    data object DetailTrend: Screen("detail_trend")
}