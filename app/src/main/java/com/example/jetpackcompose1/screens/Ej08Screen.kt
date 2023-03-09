package com.example.jetpackcompose1.screens

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Ej08Screen() {

    val context = LocalContext.current

    Text(
        text = "Probando tipos de click",
        modifier = Modifier
            .background(Color.Red)
            .padding(30.dp)
            .combinedClickable(
                onClick = {
                    Toast
                        .makeText(context, "Click simple", Toast.LENGTH_SHORT)
                        .show()
                },
                onLongClick = {
                    Toast
                        .makeText(context, "Long Click", Toast.LENGTH_SHORT)
                        .show()
                },
                onDoubleClick = {
                    Toast
                        .makeText(context, "Doble Click", Toast.LENGTH_SHORT)
                        .show()
                },
            )
    )

}