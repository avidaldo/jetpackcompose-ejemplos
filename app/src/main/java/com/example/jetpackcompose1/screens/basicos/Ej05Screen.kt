package com.example.jetpackcompose1.screens.basicos

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Flag
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val spacedByDefault = 5.dp
const val boardSize = 6 // TODO: ¿formas de controlar que nunca se salga de pantalla?


@Composable
fun Buscaminas() {
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy( // (1)
            space = spacedByDefault,
            alignment = Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Tablero(boardSize)
    }
}

@Composable
fun Tablero(lado: Int = boardSize) {
    repeat(lado) {
        Row(horizontalArrangement = Arrangement.spacedBy(spacedByDefault)) {
            repeat(lado) {
                Button(onClick = { /*TODO*/ },
                    Modifier.size(width = 50.dp, height = 50.dp)) {
                    Icon(
                        Icons.Default.Flag,
                        contentDescription = null,
                    )
                }
            }
        }
    }

}

/*
 (1)
 Para poder hacer al mismo tiempo el arrangement de centrar la column pero separar con el spaceBy

 */