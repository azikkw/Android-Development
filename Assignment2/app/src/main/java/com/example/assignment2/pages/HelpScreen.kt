package com.example.assignment2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment2.R

@Composable
fun HelpScreen(navController: NavController) {
    val image = painterResource(id = R.drawable.morearrow)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(255, 255, 255))
            .padding(top = 45.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row (verticalAlignment = Alignment.CenterVertically) {
            Button (
                onClick = { navController.popBackStack("home", inclusive = false) },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 2.dp)
                        .rotate(180F)
                )
            }
            Text (
                text = "Help",
                color = Color(0, 0, 0),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
        }

        Column(modifier = Modifier.padding(start = 25.dp)) {
            Text(
                text = "Question #1",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
            Text(
                text = "Answer to question #1 ...",
                color = Color(0, 0, 0),
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.montserratmedium))
            )
        }

        Column(modifier = Modifier.padding(start = 25.dp)) {
            Text(
                text = "Question #2",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
            Text(
                text = "Answer to question #2 ...",
                color = Color(0, 0, 0),
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.montserratmedium))
            )
        }

        Column(modifier = Modifier.padding(start = 25.dp)) {
            Text(
                text = "Question #3",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
            Text(
                text = "Answer to question #3 ...",
                color = Color(0, 0, 0),
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.montserratmedium))
            )
        }

        Column(modifier = Modifier.padding(start = 25.dp)) {
            Text(
                text = "Question #4",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
            Text(
                text = "Answer to question #4 ...",
                color = Color(0, 0, 0),
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.montserratmedium))
            )
        }
    }
}