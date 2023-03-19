package com.tcoding.composenavigation.ui.screen.navigation

sealed class NavigationScreen(val route: String) {


    object TopNews : NavigationScreen("TopNews")
    object DetailNews: NavigationScreen("DetailNews")

}
