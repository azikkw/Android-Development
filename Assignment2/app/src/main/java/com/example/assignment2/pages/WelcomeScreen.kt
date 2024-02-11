package com.example.assignment2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment2.R

@Composable
fun WelcomeScreen(navController: NavController) {
    val screenBack = painterResource(id = R.drawable.welcomeback)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(115, 122, 252)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image (
            painter = screenBack,
            contentDescription = null,
            modifier = Modifier
                .padding(top = 60.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth()
        )

        Column (
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(bottom = 10.dp)
        ) {
            Text (
                text = "Shop Space",
                fontSize = 37.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                color = Color(255, 255, 255),
                modifier = Modifier.padding(start = 25.dp, end = 25.dp, bottom = 12.dp)
            )
            Text (
                text = "Here you can buy and sell anything you want in a few clicks",
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.montserratmedium)),
                color = Color(255, 255, 255, 170),
                modifier = Modifier.padding(start = 25.dp, end = 25.dp)
            )
        }

        Column (modifier = Modifier.padding(start = 25.dp, end = 25.dp, bottom = 50.dp)) {
            Button (
                onClick = { navController.navigate("registration") },
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .fillMaxWidth()
                    .height(63.dp)
                    .clip(shape = RoundedCornerShape(32.dp)),
                colors = ButtonDefaults.buttonColors(Color(255, 255, 255))
            ) {
                Text (
                    text = "Get Started",
                    color = Color(0, 0, 0),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                )
            }

            Button (
                onClick = { navController.navigate("login") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(63.dp)
                    .clip(shape = RoundedCornerShape(32.dp)),
                colors = ButtonDefaults.buttonColors(Color(71, 81, 207, 255))
            ) {
                Text (
                    text = "Sign in",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                )
            }
        }
    }
}