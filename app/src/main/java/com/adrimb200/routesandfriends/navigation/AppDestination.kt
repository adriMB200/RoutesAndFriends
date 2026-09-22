package com.adrimb200.routesandfriends.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material.icons.outlined.PersonOutline
import androidx.compose.material.icons.outlined.Route
import androidx.compose.ui.graphics.vector.ImageVector

sealed class AppDestination(
    val route: String,
    val label: String,
    val icon: ImageVector
) {

    object Map : AppDestination(
        route = "map",
        label = "Mapa",
        icon = Icons.Outlined.Map
    )

    object Routes : AppDestination(
        route = "routes",
        label = "Rutas",
        icon = Icons.Outlined.Route
    )

    object Create : AppDestination(
        route = "create",
        label = "Crear",
        icon = Icons.Outlined.AddCircleOutline
    )

    object Chat : AppDestination(
        route = "chat",
        label = "Chat",
        icon = Icons.Outlined.ChatBubbleOutline
    )

    object Profile : AppDestination(
        route = "profile",
        label = "Perfil",
        icon = Icons.Outlined.PersonOutline
    )
}