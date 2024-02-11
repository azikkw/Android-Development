package com.example.assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment2.pages.*
import com.example.assignment2.ui.theme.Assignment2Theme
import com.example.assignment2.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userViewModel: UserViewModel by viewModels()
        setContent {
            Assignment2Theme {
                val navController = rememberNavController()
                NavHost(navController = navController, "welcome") {
                    composable("welcome") {
                        WelcomeScreen(navController)
                    }
                    composable("registration") {
                        RegistrationScreen(navController, userViewModel)
                    }
                    composable("login") {
                        LoginScreen(navController, userViewModel)
                    }
                    composable("home") {
                        HomeScreen(navController)
                    }
                    composable("setting") {
                        SettingScreen(navController)
                    }
                    composable("help") {
                        HelpScreen(navController)
                    }
                }
            }
        }
    }
}