package com.kyawlinnthant.threeforhundred.presentation.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.kyawlinnthant.navigation.NavigationInstructor
import com.kyawlinnthant.threeforhundred.presentation.home.HomeScreen
import com.kyawlinnthant.threeforhundred.presentation.home.HomeViewModel
import com.kyawlinnthant.threeforhundred.presentation.list.ListScreen
import com.kyawlinnthant.threeforhundred.presentation.list.ListViewModel

@Composable
fun MainGraph() {
    val mainVm: MainViewModel = hiltViewModel()
    val instructor = mainVm.appNavigator.instructor
    val navController = rememberNavController()
    NavigationInstructor(instructor = instructor, controller = navController)
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
    ) {
        composable(route = Screen.Home.route) {
            val homeVm: HomeViewModel = hiltViewModel()
            val uiState = homeVm.uiState.collectAsState()
            LaunchedEffect(key1 = uiState) {
                homeVm.getInitialQuote()
                homeVm.getRandomQuote()
            }
            HomeScreen(
                state = uiState.value,
                onAction = homeVm::onAction,
            )
        }
        composable(route = Screen.List.route) {
            val listVm: ListViewModel = hiltViewModel()
            val quotes = listVm.quotes.collectAsState()
            LaunchedEffect(key1 = quotes) {
                listVm.getQuotes()
            }
            ListScreen(quotes = quotes.value)
        }
    }
}

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object List : Screen("list")
}