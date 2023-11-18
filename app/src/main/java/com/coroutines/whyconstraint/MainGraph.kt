package com.coroutines.whyconstraint

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation


fun NavGraphBuilder.mainGraph(
) {
    navigation(startDestination = MainNavOption.Main.name, route = NavRoutes.MainRoute.name) {
        composable(MainNavOption.Main.name){
            MainContent()
        }
    }
}

enum class MainNavOption {
    Main
}

enum class NavRoutes {
    MainRoute,
}