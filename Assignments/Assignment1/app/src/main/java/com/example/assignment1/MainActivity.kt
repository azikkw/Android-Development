package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment1.pages.AfterWelcomeScreen
import com.example.assignment1.pages.BeforeWelcomeScreen
import com.example.assignment1.pages.LoginScreen
import com.example.assignment1.pages.RegistrationScreen
import com.example.assignment1.ui.theme.Assignment1Theme
import com.example.assignment1.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userViewModel: UserViewModel by viewModels()
        setContent {
            Assignment1Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, "beforeWelcome") {
                    composable("beforeWelcome") {
                        BeforeWelcomeScreen(navController)
                    }
                    composable("registration") {
                        RegistrationScreen(navController, userViewModel)
                    }
                    composable("login") {
                        LoginScreen(navController)
                    }
                    composable("afterWelcome") {
                        AfterWelcomeScreen(navController)
                    }
                }
            }
        }
    }
}