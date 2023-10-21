package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorDeTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextUI()
                }
            }
        }
    }
}

@Composable
fun ImageGreen(){
    val Imagen = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = Imagen,
        contentDescription = "Tick verde"
    )
}

@Composable
fun TextUI(){
 Column(modifier = Modifier
     .fillMaxSize()
     .verticalScroll(rememberScrollState()),
     verticalArrangement = Arrangement.Center,
     horizontalAlignment = Alignment.CenterHorizontally){

     ImageGreen()
    Text(
        text = "All tasks completed",
        modifier = Modifier
            .padding(top = 24.dp)
            .padding(bottom = 8.dp)
    )
    Text(
        text = "Nice work!",
        fontSize = 16.sp

    )
  }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AdministradorDeTareasTheme {
        TextUI()
    }
}
