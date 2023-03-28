package com.example.imdbapp.ui.navigation

sealed class AppScreens(val route: String) {
    object LoginScreen: AppScreens(route = "login_screen")
    object RegisterScreen: AppScreens(route = "register_screen")
    object SplashScreen: AppScreens(route = "splash_screen")
}
