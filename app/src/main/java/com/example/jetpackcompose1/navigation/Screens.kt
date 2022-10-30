package com.example.jetpackcompose1.navigation

sealed class Screens(val route: String){
    object MainScreen: Screens("initial_screen")
    object Ejemplo01: Screens("ej01")
    object Ejemplo02: Screens("ej02")
    object Ejemplo03: Screens("ej02")
    object Ejemplo04: Screens("ej02")
    object Ejemplo05: Screens("ej02")
    object Ejemplo06: Screens("ej02")
    object Ejemplo07: Screens("ej02")
    object Ejemplo08: Screens("ej02")

}

/* Sealed classes:
https://devexperto.com/sealed-classes-kotlin/
https://medium.com/droid-latam/sealed-classes-en-kotlin-por-qu%C3%A9-y-para-qu%C3%A9-67bb9e1f2e5e
*/