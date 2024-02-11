package com.example.assignment2.pages

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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.assignment2.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.assignment2.entities.UserEntity
import com.example.assignment2.viewmodel.UserViewModel

@Composable
fun RegistrationScreen(navController: NavController, userViewModel: UserViewModel) {
    val image = painterResource(id = R.drawable.morearrow)
    val emailImage = painterResource(id = R.drawable.email)
    val passwordImage = painterResource(id = R.drawable.password)
    val userImage = painterResource(id = R.drawable.user)

    var firstNameText by remember { mutableStateOf(TextFieldValue("")) }
    var lastNameText by remember { mutableStateOf(TextFieldValue("")) }
    var emailText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(255, 255, 255))
            .padding(top = 25.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row (verticalAlignment = Alignment.CenterVertically) {
            Button (
                onClick = { navController.popBackStack("welcome", inclusive = false) },
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
                text = "Fill Your Profile",
                color = Color(0, 0, 0),
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
        }

        Column(modifier = Modifier.padding(top = 30.dp, start = 25.dp, end = 25.dp)) {
            Text (
                text = "First name",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                modifier = Modifier.padding(bottom = 15.dp)
            )
            TextField (
                value = firstNameText,
                onValueChange = { newValue -> firstNameText = newValue },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text (
                        text = "Your first name",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = userImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )
        }

        Column(modifier = Modifier.padding(top = 25.dp, start = 25.dp, end = 25.dp)) {
            Text (
                text = "Last name",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                modifier = Modifier.padding(bottom = 15.dp)
            )
            TextField (
                value = lastNameText,
                onValueChange = { newValue -> lastNameText = newValue },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text (
                        text = "Your last name",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = userImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )
        }

        Column(modifier = Modifier.padding(top = 25.dp, start = 25.dp, end = 25.dp)) {
            Text (
                text = "Email",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                modifier = Modifier.padding(bottom = 15.dp)
            )
            TextField (
                value = emailText,
                onValueChange = { newValue -> emailText = newValue },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text (
                        text = "Your email",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = emailImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )
        }

        Column(modifier = Modifier.padding(top = 25.dp, start = 25.dp, end = 25.dp)) {
            Text (
                text = "Password",
                color = Color(0, 0, 0),
                fontSize = 19.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                modifier = Modifier.padding(bottom = 15.dp)
            )
            TextField (
                value = passwordText,
                onValueChange = { newValue -> passwordText = newValue },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp))
                    .shadow(2.dp),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color(0, 0, 0),
                    backgroundColor = Color(252, 252, 252),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                placeholder = {
                    Text (
                        text = "Your password",
                        color = Color(0, 0, 0, 90),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.montserratmedium))
                    )
                },
                leadingIcon = { Image(painter = passwordImage, contentDescription = null, modifier = Modifier.padding(start = 15.dp, bottom = 4.dp)) }
            )
        }

        Button (
            onClick = { addUserToDb(firstNameText.text, lastNameText.text, emailText.text, passwordText.text, navController, userViewModel) },
            modifier = Modifier
                .padding(top = 45.dp, start = 25.dp, end = 25.dp)
                .fillMaxWidth()
                .height(63.dp)
                .clip(shape = RoundedCornerShape(32.dp)),
            colors = ButtonDefaults.buttonColors(Color(71, 81, 207, 255))
        ) {
            Text (
                text = "Sign up",
                color = Color.White,
                fontSize = 17.sp,
                fontFamily = FontFamily(Font(R.font.montserratsemibold))
            )
        }

        Button (
            onClick = { navController.navigate("login") },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 0.dp,
                pressedElevation = 0.dp
            ),
            modifier = Modifier
                .padding(top = 18.dp, bottom = 30.dp)
                .fillMaxWidth()
        ) {
            Row() {
                Text (
                    text = "Already have an account? ",
                    color = Color(0, 0, 0, 120),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                )
                Text (
                    text = "Sign in",
                    color = Color(71, 81, 207, 255),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                )
            }
        }
    }
}

fun addUserToDb(userName: String, userSurname: String, userEmail: String, userPassword: String, navController: NavController, userViewModel: UserViewModel) {
    userViewModel.addUser(UserEntity(userName, userSurname, userEmail, userPassword))
    navController.navigate("login")
}