package com.Amos.BankingApp.Navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.Amos.BankingApp.data.BottomNavigation

val items = listOf(
    BottomNavigation(
        title = "Home",
        icon = Icons.Rounded.Home,
        route = Screens.HomeScreen.name
    ),

    BottomNavigation(
        title = "Wallet",
        icon = Icons.Rounded.Wallet,
        route = Screens.WalletScreen.name
    ),

    BottomNavigation(
        title = "Notifications",
        icon = Icons.Rounded.Notifications,
        route = Screens.NotificationScreen.name
    ),

    BottomNavigation(
        title = "Account",
        icon = Icons.Rounded.AccountCircle,
        route = Screens.AccountScreen.name
    )
)


@Composable
fun BottomNavigationBar(navController:NavController) {
    NavigationBar {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {

            items.forEachIndexed() { Index, item ->
                NavigationBarItem(
                    selected = currentDestination?.hierarchy?.any{it.route == item.route}== true,
                    onClick = {
                              navController.navigate(item.route){
                                  popUpTo(navController.graph.findStartDestination().id){
                                      saveState = true
                                  }
                                  launchSingleTop = true
                                  restoreState = true
                              }
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = MaterialTheme.colorScheme.onBackground
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }

        }
    }
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(route = Screens.HomeScreen.name){
                HomeScreen()
            }
            composable(route = Screens.WalletScreen.name){
                WalletScreen()
            }
            composable(route = Screens.NotificationScreen.name){
                NotificationScreen()
            }
            composable(route = Screens.AccountScreen.name){
                AccountScreen()
            }
        }
    }
}
