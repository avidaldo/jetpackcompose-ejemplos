package com.example.jetpackcompose1.screens.scaffold

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.jetpackcompose1.R


// https://devexperto.com/appbar-scaffold-jetpack-compose/

@Composable
fun Ej06Screen() {
    Text(text = stringResource(id = R.string.app_name))
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) })
        },
        bottomBar = {
            BottomAppBar() {
                Text(text = "Screen1")
                Text(text = "Screen2")
            }
        }
    ) {// (1)
        BottomAppBar() { // (2)
            Text(text = "Screen1")
            Text(text = "Screen2")
        }
        Column(
            modifier = Modifier.fillMaxSize().//padding(it) // (3)
            ,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "Hola mundo",
            )
        }
    }
}

/**
 * (1) Scaffold pasa como parámetro de la lambda content los valores de padding que genera
 * con los elementos que añade alrededor de este contenido (la BottomAppBar).
 *
 * (2) La BottomAppBar está pensada para pasarse como parámetro bottomBar, que ya tiene su
 * lógica específica para colocarse en la parte de abajo de la pantalla. Si la usamos en el
 * content no se posiciona allí. En general, no tendrá sentido usarla fuera de su parámetro
 * específico.
 *
 * (3) Si no pasamos los paddingValues, el Text queda oculto bajo la bottomBar.
 * El mensaje de error en este caso permite igualmente compilar y ejecutar, y veremos cómo
 * si no los pasamos, el textView queda oculto por la bottomBar
 *
 */