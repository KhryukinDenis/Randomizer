package com.example.randomizer

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {

    val mContext = LocalContext.current

    Scaffold(
        topBar = { TopAppBar(backgroundColor = Color.White) {
            IconButton(onClick = { mContext.startActivity(Intent(mContext, NavigationActivity::class.java)) } ) {
                Icon(Icons.Filled.Menu, contentDescription = "Меню")
            }
            Text("Randomizer", color = Color.Gray, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        }
                 },
        content = { MyContent() }
    )
}

@Composable
fun MyContent(){
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.cube),
            contentDescription = "background")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}






