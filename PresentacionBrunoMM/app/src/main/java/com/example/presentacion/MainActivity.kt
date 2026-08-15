package com.example.presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentacion.ui.theme.PresentacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF9DECD7)
                )
                {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .align(Alignment.Center)
                                .offset(y = (-45).dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            GreetingImage()
                            GreetingText(
                                name = "Bruno Mateluna",
                                title = "Ing Informatico"
                            )
                        }
                        GreetingContact(
                            phone = "Phone: +56 9 4976 7345",
                            linkedin = "Ig: @4n0th3r_b31ng",
                            mail = "Mail: Brunomatelunam@gmail.com",
                            modifier = Modifier
                                .padding(bottom = 32.dp)
                                .align(Alignment.BottomCenter)

                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_icon_sin_borde)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.size(150.dp)
            .padding(16.dp)
    )
}

@Composable
fun GreetingText(name:  String, title: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = name,
            fontSize = 38.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun GreetingContact(phone: String, linkedin: String, mail: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
    ) {
        Text(
            text = phone,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = linkedin,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = mail,
            fontSize = 14.sp,
            modifier = Modifier
                .padding(3.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentacionTheme {
        GreetingText(
            name = "Bruno Mateluna",
            title = "Ing. Informatico"
            )
    }
}