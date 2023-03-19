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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tcoding.composenavigation.ui.screen.navigation.NavigationScreen

@Composable
fun TopNews(navController: NavController) {

    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Top News Screen")
        Button(colors = ButtonDefaults.buttonColors(Color.Magenta), onClick = {
            navController.navigate(NavigationScreen.DetailNews.route)
        }) {
            Text(text = "Go to detail news screen")
        }
    }

}


@Preview(showBackground = true)
@Composable
fun TopNewsPreview() {
    TopNews(rememberNavController())
}