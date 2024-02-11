package com.example.assignment2.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.assignment2.R
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(navController: NavController) {
    val studentImg = painterResource(id = R.drawable.userimg)
    val salesImg = painterResource(id = R.drawable.news)

    Column (
        modifier = Modifier.fillMaxSize().background(Color(255, 255, 255)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column() {
            Row (
                modifier = Modifier
                    .padding(top = 30.dp, start = 20.dp, end = 20.dp, bottom = 30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image (
                        painter = studentImg,
                        contentDescription = null,
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                    )
                    Text (
                        text = "Scott M.",
                        color = Color(0, 0, 0),
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.montserratbold)),
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
                var expanded by remember { mutableStateOf(false) }
                Box {
                    IconButton (
                        onClick = { expanded = true },
                        modifier = Modifier
                            .width(52.dp)
                            .height(52.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .background(Color(236, 237, 239))
                    ) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Show menu")
                    }
                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        offset = DpOffset(x = 0.dp, y = 15.dp),
                        modifier = Modifier.background(Color(250, 250, 250)).padding(start = 10.dp, end = 10.dp)
                    ) {
                        DropdownMenuItem(onClick = { navController.navigate("setting") }) {
                            Text (
                                text = "Settings",
                                color = Color(0, 0, 0),
                                fontFamily = FontFamily(Font(R.font.montserratmedium)),
                            )
                        }
                        DropdownMenuItem(onClick = { navController.navigate("help") }) {
                            Text (
                                text = "Help",
                                color = Color(0, 0, 0),
                                fontFamily = FontFamily(Font(R.font.montserratmedium)),
                            )
                        }
                        Divider(color = Color(230, 230, 230))
                        DropdownMenuItem(onClick = { navController.popBackStack("welcome", inclusive = false) }) {
                            Text (
                                text = "Log out",
                                color = Color(0, 0, 0),
                                fontFamily = FontFamily(Font(R.font.montserratmedium)),
                            )
                        }
                    }
                }
            }

            Column (
                modifier = Modifier.fillMaxWidth().height(515.dp).verticalScroll(ScrollState(0))
            ) {
                Image(
                    painter = salesImg,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(20.dp))
                )

                Row(
                    modifier = Modifier
                        .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(Color(0, 0, 0)),
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .width(50.dp)
                            .height(8.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                    ) {}
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(Color(158, 158, 158, 255)),
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .width(8.dp)
                            .height(8.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                    ) {}
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(Color(158, 158, 158, 255)),
                        modifier = Modifier
                            .padding(end = 6.dp)
                            .width(8.dp)
                            .height(8.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                    ) {}
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(Color(158, 158, 158, 255)),
                        modifier = Modifier
                            .width(8.dp)
                            .height(8.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                    ) {}
                }

                Column (
                    modifier = Modifier.padding(top = 30.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row (
                        modifier = Modifier.padding(bottom = 20.dp).fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(152.dp)
                        ) {
                            val image = painterResource(id = R.drawable.c1)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(152.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                text = "Modern Raincoat",
                                color = Color(0, 0, 0, 255),
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Outerwear",
                                    color = Color(107, 107, 107, 255),
                                    fontSize = 13.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                                )
                                Text(
                                    text = "67 500 ₸",
                                    color = Color(0, 0, 0, 255),
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                                )
                            }
                        }
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(152.dp)
                        ) {
                            val image = painterResource(id = R.drawable.c2)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(152.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                text = "Zeep hoodie",
                                color = Color(0, 0, 0, 255),
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Hoodies",
                                    color = Color(107, 107, 107, 255),
                                    fontSize = 13.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                                )
                                Text(
                                    text = "18 600 ₸",
                                    color = Color(0, 0, 0, 255),
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                                )
                            }
                        }
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(152.dp)
                        ) {
                            val image = painterResource(id = R.drawable.c3)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(152.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                text = "ASICS sneakers",
                                color = Color(0, 0, 0, 255),
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Sneakers",
                                    color = Color(107, 107, 107, 255),
                                    fontSize = 13.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                                )
                                Text(
                                    text = "29 990 ₸",
                                    color = Color(0, 0, 0, 255),
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                                )
                            }
                        }
                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.width(152.dp)
                        ) {
                            val image = painterResource(id = R.drawable.c4)
                            Image(
                                painter = image,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(152.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                text = "Vintage Backpack",
                                color = Color(0, 0, 0, 255),
                                fontSize = 16.sp,
                                fontFamily = FontFamily(Font(R.font.montserratsemibold)),
                                modifier = Modifier.padding(top = 10.dp, bottom = 5.dp)
                            )
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Backpack",
                                    color = Color(107, 107, 107, 255),
                                    fontSize = 13.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratmedium))
                                )
                                Text(
                                    text = "43 400 ₸",
                                    color = Color(0, 0, 0, 255),
                                    fontSize = 14.sp,
                                    fontFamily = FontFamily(Font(R.font.montserratsemibold))
                                )
                            }
                        }
                    }
                }
            }
        }

        Row (
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(start = 5.dp, end = 6.dp, top = 10.dp, bottom = 12.dp)
                .fillMaxWidth()
        ) {
            val homeIcon = painterResource(id = R.drawable.home)
            val catalogIcon = painterResource(id = R.drawable.catalog)
            val favoriteIcon = painterResource(id = R.drawable.favorite)
            val cartIcon = painterResource(id = R.drawable.cart)
            val dashboardIcon = painterResource(id = R.drawable.dashboard)

            Button (
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = homeIcon,
                    contentDescription = null
                )
            }
            Button (
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = catalogIcon,
                    contentDescription = null
                )
            }
            Button (
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = favoriteIcon,
                    contentDescription = null
                )
            }
            Button (
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = cartIcon,
                    contentDescription = null
                )
            }
            Button (
                onClick = {  },
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                elevation = ButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp
                )
            ) {
                Image (
                    painter = dashboardIcon,
                    contentDescription = null
                )
            }
        }
    }
}