package com.adrimb200.routesandfriends.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.adrimb200.routesandfriends.ui.screens.chat.ChatScreen
import com.adrimb200.routesandfriends.ui.screens.create.CreateRouteScreen
import com.adrimb200.routesandfriends.ui.screens.map.MapScreen
import com.adrimb200.routesandfriends.ui.screens.profile.ProfileScreen
import com.adrimb200.routesandfriends.ui.screens.routes.RoutesScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoutesAndFriendsNavigation() {

    val navController = rememberNavController()

    val destinations = listOf(
        AppDestination.Map,
        AppDestination.Routes,
        AppDestination.Create,
        AppDestination.Chat,
        AppDestination.Profile
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry
        ?.destination
        ?.route

    Scaffold(
        bottomBar = {

            NavigationBar {

                destinations.forEach { destination ->

                    NavigationBarItem(
                        selected = currentRoute == destination.route,

                        onClick = {

                            navController.navigate(destination.route) {

                                popUpTo(
                                    navController.graph
                                        .findStartDestination()
                                        .id
                                ) {
                                    saveState = true
                                }

                                launchSingleTop = true
                                restoreState = true
                            }
                        },

                        icon = {
                            Icon(
                                imageVector = destination.icon,
                                contentDescription = destination.label
                            )
                        },

                        label = {
                            Text(destination.label)
                        }
                    )
                }
            }
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = AppDestination.Map.route,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(AppDestination.Map.route) {
                MapScreen()
            }

            composable(AppDestination.Routes.route) {
                RoutesScreen()
            }

            composable(AppDestination.Create.route) {
                CreateRouteScreen()
            }

            composable(AppDestination.Chat.route) {
                ChatScreen()
            }

            composable(AppDestination.Profile.route) {
                ProfileScreen()
            }
        }
    }
}