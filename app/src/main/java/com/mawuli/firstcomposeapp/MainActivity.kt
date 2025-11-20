package com.mawuli.firstcomposeapp

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mawuli.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HelloStudents()
                }
            }
        }
    }
}

@Composable
fun HelloStudents() {

    Column(
        modifier = Modifier
            .background(Color.Yellow)
            .padding(8.dp)
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.compose_logo),
            contentDescription = "Android logo",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp) )



        )



        Text(
            text = "Matrix Chat",
            fontSize = 30.sp,
            fontWeight = FontWeight.W500,
            color = Color.Magenta
        )

//        OutlinedTextField(
//            value = "",
//            onValueChange = {},
//            label = { Text(text = "Email") },
//            modifier = Modifier
//        )

        Spacer(Modifier.height(50.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )
        {
            Button(
                onClick = {}, shape = RoundedCornerShape(10.dp), modifier = Modifier

                    .width(100.dp)
            ) {
                Text(text = "Login")
            }

            Spacer(Modifier.width(10.dp))

            Button(
                onClick = {}, shape = RoundedCornerShape(10.dp), modifier = Modifier.width(100.dp)
            ) {
                Text(text = "Sign up")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    HelloStudents()
}
