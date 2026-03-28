package com.example.rakshak.Main_UI

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.rakshak.ui.theme.*

@Composable
fun MainScreen(userName: String) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { MainBottomNavigation(navController) },
        containerColor = DarkBackground
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "status",
            modifier = Modifier.padding(paddingValues),
            enterTransition = {
                slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Left, animationSpec = tween(300)) + fadeIn(animationSpec = tween(300))
            },
            exitTransition = {
                slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Left, animationSpec = tween(300)) + fadeOut(animationSpec = tween(300))
            },
            popEnterTransition = {
                slideIntoContainer(AnimatedContentTransitionScope.SlideDirection.Right, animationSpec = tween(300)) + fadeIn(animationSpec = tween(300))
            },
            popExitTransition = {
                slideOutOfContainer(AnimatedContentTransitionScope.SlideDirection.Right, animationSpec = tween(300)) + fadeOut(animationSpec = tween(300))
            }
        ) {
            composable("status") { StatusScreen(userName) }
            composable("network") { NetworkScreen() }
            composable("sos") { HomeScreen(userName) }
            composable("profile") { }
        }
    }
}

@Composable
fun MainBottomNavigation(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    NavigationBar(
        containerColor = BottomNavBg,
        tonalElevation = 0.dp
    ) {
        NavigationBarItem(
            selected = currentDestination?.hierarchy?.any { it.route == "status" } == true,
            onClick = { navController.navigate("status") {
                popUpTo(navController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            } },
            icon = { Icon(Icons.Default.Radar, contentDescription = "Status") },
            label = { Text("STATUS", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TextPrimary,
                selectedTextColor = TextPrimary,
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary,
                indicatorColor = SurfaceIconBg
            )
        )
        NavigationBarItem(
            selected = currentDestination?.hierarchy?.any { it.route == "network" } == true,
            onClick = { navController.navigate("network") {
                popUpTo(navController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            } },
            icon = { Icon(Icons.Default.Group, contentDescription = "Network") },
            label = { Text("NETWORK", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TextPrimary,
                selectedTextColor = TextPrimary,
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary,
                indicatorColor = SurfaceIconBg
            )
        )
        NavigationBarItem(
            selected = currentDestination?.hierarchy?.any { it.route == "sos" } == true,
            onClick = { navController.navigate("sos") {
                popUpTo(navController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            } },
            icon = { Text("*", color = if(currentDestination?.hierarchy?.any { it.route == "sos" } == true) TextPrimary else RedButton, fontSize = 28.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 8.dp)) },
            label = { Text("SOS", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TextPrimary,
                selectedTextColor = TextPrimary,
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary,
                indicatorColor = SurfaceIconBg
            )
        )
        NavigationBarItem(
            selected = currentDestination?.hierarchy?.any { it.route == "profile" } == true,
            onClick = { navController.navigate("profile") {
                popUpTo(navController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            } },
            icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
            label = { Text("PROFILE", fontSize = 10.sp, letterSpacing = 1.sp) },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = TextPrimary,
                selectedTextColor = TextPrimary,
                unselectedIconColor = TextSecondary,
                unselectedTextColor = TextSecondary,
                indicatorColor = SurfaceIconBg
            )
        )
    }
}
