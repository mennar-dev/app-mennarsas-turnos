package com.mennarsas.app_mennar_turnos.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TurnerosScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(
                text = "Bienvenido al sistema de turneros",
                modifier = Modifier.padding(16.dp)
            )
            // Aquí puedes agregar la lista de turnos y su lógica
        }
    }
}