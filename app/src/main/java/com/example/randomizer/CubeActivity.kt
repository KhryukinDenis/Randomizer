package com.example.randomizer

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CubeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent5()
        }
    }
}

@Composable
fun MainContent5() {
    val mContext = LocalContext.current

    Scaffold(
        topBar = { TopAppBar(backgroundColor = Color.White) {
            IconButton(onClick = { mContext.startActivity(Intent(mContext, NavigationActivity::class.java)) } ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
            }
            Text("КУБИКИ", color = Color.Gray, fontSize = 26.sp)
        }
        },
        content = { MyContent5() }
    )
}

@Composable
fun MyContent5() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {

        Text("Количество кубиков (от 1 до 6):", color = Color.Gray, fontSize = 24.sp,
            modifier = Modifier.padding(8.dp))
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .padding(8.dp),
            value = text, onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text="количество")
            })

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            modifier = Modifier.padding(8.dp).width(200.dp).height(60.dp),
        ) {
            Text("Бросить", color = Color.White, fontSize = 28.sp)
        }
    }
}