package com.tcoding.composenavigation.ui.screen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tcoding.composenavigation.ui.screen.DetailNews
import com.tcoding.composenavigation.ui.screen.TopNews

@Composable
fun NewsNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.TopNews.route) {
        composable(NavigationScreen.DetailNews.route) {
            DetailNews(navController = navController)
        }

        composable(NavigationScreen.TopNews.route) {
            TopNews(navController = navController)
        }
    }


}