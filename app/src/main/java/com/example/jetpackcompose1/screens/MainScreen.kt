package com.example.jetpackcompose1.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.jetpackcompose1.navigation.Screens

@Composable
fun MainScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = { navController.navigate(route = Screens.Ejemplo01.route) }) {
            Text(text = "Ejemplo 1")
        }
        Button(onClick = { navController.navigate(route = Screens.Ejemplo02.route) }) {
            Text(text = "Ejemplo 2")
        }
    }

}