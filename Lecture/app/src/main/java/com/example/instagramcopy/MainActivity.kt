package com.example.instagramcopy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramcopy.ui.theme.InstagramCopyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramCopyTheme {
                // A surface container using the 'background' color from the theme
                Surface (
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.padding(top = 150.dp, bottom = 150.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        LogoLoading()
                        AuthorizationInputs()
                    }
                }
            }
        }
    }
}

@Composable
fun LogoLoading() {
    val image = painterResource(id = R.drawable.instagram_logo_svg)
    Image (
        painter = image,
        contentDescription = null,
        modifier = Modifier.width(190.dp)
    )
}

@Composable
fun AuthorizationInputs() {
    var loginText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }
    OutlinedTextField (
        value = loginText,
        onValueChange = { newValue -> loginText = newValue },
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, top = 30.dp)
            .fillMaxWidth()
            .background(Color(240, 240, 240)),
        placeholder = { Text("User name") }
    )
    OutlinedTextField (
        value = passwordText,
        onValueChange = { newValue -> passwordText = newValue },
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, top = 15.dp)
            .fillMaxWidth()
            .background(Color(240, 240, 240)),
        placeholder = { Text("User password") },
    )
    Row (
        modifier = Modifier
            .padding(top = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        SimpleCheckbox()
        Text(text = "Remember me")
    }
    Button (
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp, top = 10.dp)
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(Color(3, 169, 244, 255))
    ) {
        Text(text = "Sign in", color = Color.White)
    }
    Button (
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(top = 5.dp),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        elevation = null
    ) {
        Text(text = "Forgot password? Get help")
    }
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ) {
        Button (
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(bottom = 15.dp),
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            elevation = null
        ) {
            Text(text = "Not registered yet? Register")
        }
    }
}

@Composable
fun SimpleCheckbox() {
    val isChecked = remember { mutableStateOf(false) }
    Checkbox (
        checked = isChecked.value,
        onCheckedChange = { isChecked.value = it },
        colors = CheckboxDefaults.colors(Color.Blue)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstagramCopyTheme {
        Column (
            //modifier = Modifier.padding(top = 150.dp, bottom = 150.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LogoLoading()
            AuthorizationInputs()
        }
    }
}