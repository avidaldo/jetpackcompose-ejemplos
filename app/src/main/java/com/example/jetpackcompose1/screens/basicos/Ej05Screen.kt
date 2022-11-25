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
const val boardSize = 8


@Composable
fun Buscaminas() {
    Column(
        Modifier.fillMaxSize().padding(10.dp),
        verticalArrangement = Arrangement.spacedBy( // (1)
            space = spacedByDefault,
            alignment = Alignment.CenterVertically
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        repeat(boardSize) {
            Row(horizontalArrangement = Arrangement.spacedBy(spacedByDefault)) {
                repeat(boardSize) {
                    Button(
                        onClick = { /*TODO*/ },
                        Modifier
                            .weight(1f)
                            .aspectRatio(1f)
                    ) {
                        Icon(
                            Icons.Default.Flag,
                            contentDescription = null,
                        )
                    }
                }
            }
        }
    }
}


/*
 (1)
 Para poder hacer al mismo tiempo el arrangement de centrar la column pero separar con el spaceBy

 */