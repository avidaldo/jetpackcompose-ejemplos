package com.example.jetpackcompose1.screens.scaffold

import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
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
    ){
        /* Scaffold pasa como parámetro de la lambda content los valores de padding que genera
        con los elementos que añade alrededor de este contenido. Son ncesarios para que el contenido
        no quede debajo de la BottomAppBar */

        BottomAppBar() {// Probando este elemento dentro del contenido (no se utiliza así)
            Text(text = "Screen1")
            Text(text = "Screen2")
        }
        Text(text = "Hola mundo",
            modifier = Modifier.padding(it)
        )

    }

}