package com.adrimb200.routesandfriends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.adrimb200.routesandfriends.navigation.RoutesAndFriendsNavigation
import com.adrimb200.routesandfriends.ui.theme.RoutesAndFriendsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            RoutesAndFriendsTheme {

                RoutesAndFriendsNavigation()

            }
        }
    }
}