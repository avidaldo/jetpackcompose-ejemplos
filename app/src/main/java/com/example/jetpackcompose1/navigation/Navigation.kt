package com.example.jetpackcompose1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose1.screens.*

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.MainScreen.route) {
        composable(route = Screens.MainScreen.route) { MainScreen(navController) }
        composable(route = Screens.Ejemplo01.route) { Ej01Screen() }
        composable(route = Screens.Ejemplo02.route) { Ej02Screen() }
        composable(route = Screens.Ejemplo03.route) { Ej03Screen() }
        composable(route = Screens.Ejemplo04.route) { Ej04Screen() }
        composable(route = Screens.Ejemplo05.route) { Ej05Screen() }
        composable(route = Screens.Ejemplo06.route) { Ej06Screen() }
        composable(route = Screens.Ejemplo07.route) { Ej07Screen() }
        composable(route = Screens.Ejemplo08.route) { Ej08Screen() }

    }
}


/* Sobre navigation Compose:
https://developer.android.com/jetpack/compose/navigation
https://www.youtube.com/watch?v=4gUeyNkGE3g
https://devexperto.com/navegacion-jetpack-compose/
https://www.youtube.com/watch?v=eNuaMn4ukdo
 */
