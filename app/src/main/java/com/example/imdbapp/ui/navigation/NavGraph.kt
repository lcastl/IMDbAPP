package com.example.imdbapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.imdbapp.ui.SplashScreen
import com.example.presentation.ui.LoginScreen
import com.example.presentation.ui.RegisterScreen


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.route
    ) {

        composable(
            route = AppScreens.SplashScreen.route
        ) {
            SplashScreen(navController = navController)
        }

        composable(
            route = AppScreens.LoginScreen.route
        ) {
            LoginScreen { navController.navigate(route = AppScreens.RegisterScreen.route) }
        }

        composable(
            route = AppScreens.RegisterScreen.route
        ) {
            RegisterScreen(navController = navController) { navController.navigate(route = AppScreens.LoginScreen.route) }
        }
    }
}
