package com.example.assignment1.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment1.R

@Composable
fun LoginScreen(navController: NavController) {
    val image = painterResource(id = R.drawable.morearrow)
    val emailImage = painterResource(id = R.drawable.email)
    val passwordImage = painterResource(id = R.drawable.password)

    var emailText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(255, 255, 255))
            .padding(top = 45.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Button (
            onClick = { navController.popBackStack("beforeWelcome", inclusive = false) },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            )
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 2.dp)
                    .rotate(180F)
            )
        }

        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 50.dp)
        ) {
            Text (
                text = "Shop Space",
                color = Color(71, 81, 207, 255),
                fontSize = 38.sp,
                fontFamily = FontFamily(Font(R.font.montserratbold)),
                modifier = Modifier.padding(bottom = 70.dp)
            )

            TextField (
                value = emailText,
                onValueChange = { newValue -> emailText = newValue },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier
                    .padding(start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(32.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text(
                        text = "Your email",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = emailImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )

            TextField (
                value = passwordText,
                onValueChange = { newValue -> passwordText = newValue },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .padding(top = 12.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(32.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text(
                        text = "Your password",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = passwordImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )

            Button (
                onClick = { checkUser(emailText.toString(), passwordText.toString(), navController) },
                modifier = Modifier
                    .padding(top = 18.dp, start = 25.dp, end = 25.dp)
                    .fillMaxWidth()
                    .height(63.dp)
                    .clip(shape = RoundedCornerShape(32.dp)),
                colors = ButtonDefaults.buttonColors(Color(71, 81, 207, 255))
            ) {
                Text(
                    text = "Sign in",
                    color = Color.White,
                    fontSize = 17.sp,
                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                )
            }
        }

        Button (
            onClick = { navController.navigate("registration") },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            ),
            modifier = Modifier.padding(bottom = 30.dp).fillMaxWidth()
        ) {
            Row() {
                Text (
                    text = "Don’t have an account? ",
                    color = Color(0, 0, 0, 120),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                )
                Text (
                    text = "Sign up",
                    color = Color(71, 81, 207, 255),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                )
            }
        }
    }
}

fun checkUser(userEmail: String, userPassword: String, navController: NavController) {
//    myDbManager.openDB()
//    for(i in myDbManager.readDbData()) {
//        if(i.email.equals(userEmail) && i.password.equals(userPassword)) {
//        }
//    }
    navController.navigate("afterWelcome")
}