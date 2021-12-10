package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationComponent(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = "welcome" ,){
        composable(route = "welcome"){ WelcomeScreen(navHostController)}
        composable(route = "log in"){ LogInScreen(navHostController)}
        composable(route = "home screen"){ HomeScreen() }
    }

}