package com.il.tugasfejc.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.il.tugasfejc.R
import com.il.tugasfejc.nav.Screen
import com.il.tugasfejc.nav.NavItem
import com.il.tugasfejc.component.shareItem
import com.il.tugasfejc.component.searchItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Tokupedia(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Tokupedia",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFE2F3F5)
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF1F4287)
                ),
                actions = {
                    IconButton(onClick = { searchItem(context) }) {
                        Icon(imageVector = Icons.Default.Search, tint = Color.White, contentDescription = stringResource(
                            id = R.string.menu_search
                        ))
                    }
                    IconButton(onClick = { shareItem(context) }) {
                        Icon(
                            imageVector = Icons.Default.Share, tint = Color.White, contentDescription = stringResource(
                                id = R.string.menu_share
                            )
                        )
                    }
                },
                modifier = Modifier
                    .shadow(6.dp)
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.Gallery.route) {
                GalleryScreen()
            }

            composable(Screen.Profil.route) {
                AboutScreen()
            }

            composable(
                Screen.DetailMent.route + "/{mentorId}",
                arguments = listOf(navArgument("mentorId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailMentorScreen(
                    navController = navController,
                    mentorsId = navBackStackEntry.arguments?.getInt("mentorId")
                )
            }

            composable(
                Screen.DetailTrend.route + "/{menteeId}",
                arguments = listOf(navArgument("menteeId"){
                    type = NavType.IntType
                })
            ){navBackStackEntry->
                DetailTrending(
                    navController = navController,
                    trendId = navBackStackEntry.arguments?.getInt("menteeId")
                )
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = Modifier.shadow(10.dp),
        contentColor = Color(0xFF1F4287), // 0xFFE2F3F5
        containerColor = Color.White, // buat All 0xFF1F4287
        windowInsets = NavigationBarDefaults.windowInsets,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavItem(
                title = stringResource(id = R.string.menu_gallery),
                icon = Icons.Default.List,
                screen = Screen.Gallery
            ),
            NavItem(
                title = stringResource(id = R.string.menu_profil),
                icon = Icons.Default.AccountCircle,
                screen = Screen.Profil
            )
        )
        navigationItems.forEach { item ->
            val isSelected = currentRoute == item.screen.route
            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = null,
                        tint = if (isSelected) Color(0xFF1F4287) else Color(0xFF757373)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        color = if (isSelected) Color(0xFF1F4287) else Color(0xFF757373)
                    )
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InfiniteAppPrev() {
    Tokupedia()
}