package com.example.randomizer

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent2()
        }
    }
}

@Composable
fun MainContent2() {

    val mContext = LocalContext.current

    Scaffold(
        topBar = { TopAppBar(backgroundColor = Color.White) {
            IconButton(onClick = { mContext.startActivity(Intent(mContext, MainActivity::class.java)) } ) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
            }
            Text("НАВИГАЦИЯ", color = Color.Gray, fontSize = 26.sp)
        }
        },
        content = { MyContent2() }
    )
}

@Composable
fun MyContent2(){

    val mContext = LocalContext.current

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Button(onClick = {
            mContext.startActivity(Intent(mContext, NumberGeneratorActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
            modifier = Modifier.padding(10.dp).width(330.dp).height(80.dp),
        ) {
            Text("Генератор чисел", color = Color.White, fontSize = 35.sp)
        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext, SelectionActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
            modifier = Modifier.padding(10.dp).width(330.dp).height(80.dp),
        ) {
            Text("Выбор из списка", color = Color.White, fontSize = 35.sp)
        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext, CubeActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
            modifier = Modifier.padding(10.dp).width(330.dp).height(80.dp),

        ) {
            Text("Кубики", color = Color.White, fontSize = 35.sp)
        }

        Button(onClick = {
            mContext.startActivity(Intent(mContext, CoinActivity::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
            modifier = Modifier.padding(10.dp).width(330.dp).height(80.dp),
        ) {
            Text("Монетка", color = Color.White, fontSize = 35.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    MainContent2()
}