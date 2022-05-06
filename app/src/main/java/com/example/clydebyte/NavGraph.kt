package com.example.clydebyte

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(

        navController = navController,
        startDestination = Screen.Page1.route
    ) {

        composable(
            route = Screen.Page1.route
        ) {
            Page1(navController)
        }
        composable(
            route = Screen.Page2.route
        ) {
            Page2(navController)
        }
        composable(
            route = Screen.Page3.route
        ) {
            Page3(navController)
        }
        composable(
            route = Screen.Page4.route
        ) {
            Page4(navController)
        }
        composable(
            route = Screen.Page5.route
        ) {
            Page5(navController)
        }
    }
}