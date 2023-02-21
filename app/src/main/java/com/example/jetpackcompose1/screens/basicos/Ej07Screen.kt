package com.example.jetpackcompose1.screens.basicos

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Ej07Screen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)){
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp)
            .background(color = Color.Green)) {
            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .padding(all = 10.dp)
                .border(width = 1.dp, color = Color.Blue)
                .padding(all = 50.dp)) {
                Cuadricula(modifier = Modifier.weight(1f))
            }

            Column(modifier = Modifier
                .weight(1f)
                .fillMaxSize()
                .padding(all = 50.dp)
                .border(width = 1.dp, color = Color.Red)
                .background(Color.Yellow)
                .clickable {  }
                .padding(all = 25.dp)
                .border(width = 1.dp, color = Color.Black)
                .clickable(enabled = false) {  }) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White))
            }
        }
    }
}

@Composable
fun Cuadricula(modifier: Modifier = Modifier){
    repeat(3){
        Row(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .border(width = 1.dp, color = Color.Magenta)
            .padding(all = 5.dp)
            .then(modifier)){
            repeat(3){
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray)
                    .padding(5.dp)
                    .border(width = 1.dp, color = Color.Yellow)
                    .clickable { }
                    .padding(5.dp)
                    .border(width = 1.dp, color = Color.Red)
                    .background(color = Color.Blue)
                    .padding(8.dp)
                    .border(width = 1.dp, color = Color.White)
                    .background(color = Color.LightGray)
                    .clickable(enabled = false) {}
                    .then(modifier),
                    verticalArrangement = Arrangement.Center) {

                }
            }
        }
    }
}