package com.ashish.mygithub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ashish.mygithub.screens.landingscreen.StarterScreen
import com.ashish.mygithub.screens.reposcreen.AddRepoScreen
import com.ashish.mygithub.viewmodles.MainViewModel


@Composable
fun NavGraph(viewModel: MainViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.StarterScreen.route) {
        composable(Screens.StarterScreen.route) {
            StarterScreen(navController, viewModel)
        }
//        composable(Screens.AddRepoScreen.route){
//
//
//        }
        composable(Screens.AddRepoScreen.route) {
            AddRepoScreen(navController)
        }
//        composable(Screens.StarterScreen.route){
//            StarterScreen(navController)
//        }
//        composable(Screens.StarterScreen.route){
//            StarterScreen(navController)
//        }

    }


}