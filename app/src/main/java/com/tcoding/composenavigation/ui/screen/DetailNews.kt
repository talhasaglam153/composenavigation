package com.tcoding.composenavigation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.tcoding.composenavigation.ui.screen.navigation.NavigationScreen

@Composable
fun DetailNews(navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Detail News Screen")
        Button(colors = ButtonDefaults.buttonColors(Color.Magenta) ,onClick = {
            navController.navigate(NavigationScreen.TopNews.route)
        }) {
            Text(text = "Go to Top news screen")
        }
    }
}