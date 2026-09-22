package com.adrimb200.routesandfriends.ui.screens.map

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Map
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MapScreen() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Icon(
            imageVector = Icons.Outlined.Map,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Mapa",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Aquí aparecerán tus rutas y posición GPS."
        )
    }
}