package com.lac.imdbapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lac.imdbapp.ui.SplashScreen
import com.lac.presentation.ui.LoginScreen
import com.lac.presentation.ui.RegisterScreen


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
            LoginScreen(
                { navController.navigate(route = AppScreens.RegisterScreen.route) },
                rememberNavController()
            )
        }

        composable(
            route = AppScreens.RegisterScreen.route
        ) {
            RegisterScreen(navController = navController) { navController.navigate(route = AppScreens.LoginScreen.route) }
        }
    }
}
