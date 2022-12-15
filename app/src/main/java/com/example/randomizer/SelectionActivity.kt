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

class SelectionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent4()
        }
    }
}

@Composable
fun MainContent4() {
    val mContext = LocalContext.current

    Scaffold(
        topBar = { TopAppBar(backgroundColor = Color.White) {
            IconButton(onClick = { mContext.startActivity(Intent(mContext, NavigationActivity::class.java)) } ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
            }
            Text("ВЫБОР ИЗ СПИСКА", color = Color.Gray, fontSize = 26.sp)
        }
        },
        content = { MyContent4() }
    )
}

@Composable
fun MyContent4() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {

        Text("Количество строк:", color = Color.Gray, fontSize = 24.sp,
        modifier = Modifier.padding(8.dp))
        var text by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .padding(8.dp),
            value = text, onValueChange = { newText ->
                text = newText
            },
            label = {
                Text(text="Количество")
            })

        Text("Варианты (по одному в строке):", color = Color.Gray, fontSize = 24.sp,
            modifier = Modifier.padding(8.dp))
        var text2 by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .height(200.dp)
                .padding(8.dp),
            value = text2, onValueChange = { newText ->
                text2 = newText
            })

        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
            modifier = Modifier.padding(8.dp).width(200.dp).height(60.dp),
        ) {
            Text("Выбрать", color = Color.White, fontSize = 28.sp)
        }

        Text("Результат генерации:", color = Color.Gray, fontSize = 24.sp,
            modifier = Modifier.padding(8.dp))
        var text3 by remember { mutableStateOf("") }
        OutlinedTextField(
            modifier = Modifier
                .padding(8.dp),
            value = text3, onValueChange = { newText ->
                text3 = newText
            })
    }
}