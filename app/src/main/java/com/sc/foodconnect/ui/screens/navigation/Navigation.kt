package com.sc.foodconnect.ui.screens.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.sc.foodconnect.ui.screens.authentication.login.LoginScreen
import com.sc.foodconnect.ui.screens.onboarding.onboarding
import com.sc.foodconnect.ui.screens.profile.aboutus
import com.sc.foodconnect.ui.screens.profile.contactus
import com.sc.foodconnect.ui.screens.profile.homescreen


@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier) {
    NavHost(
        navController = navController,
        startDestination = routes.onboarding
    ) {
        composable(routes.onboarding.name){ onboarding() }
        composable(routes.homepage.name){ homescreen() }
        composable(routes.aboutpage.name){ aboutus() }
        composable(routes.contactpage.name){ contactus() }
        composable(routes.loginpage.name){ LoginScreen() }

    }
}



@Composable
fun NavHost(
    navController: NavHostController,
    startDestination: Onboarding,
    content: @Composable () -> composable
) {
}