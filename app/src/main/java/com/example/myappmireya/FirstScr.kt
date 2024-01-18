package com.example.myappmireya

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun FirstScr(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "")
        Text(text = "•  Asesoramiento jurídico.\n•  Derivación SARA personas víctimas de violencia de género.\n•  Derivación a HABITATGE.\n•  Derivación a residencias públicas para personas en situación de dependencia.")
        Text(text = "•  Ayuda domicilio y teleasistencia para personas dependientes.\n•  Ayudas y prestaciones económicas.\n•  Comedores sociales.\n•  Duchas sociales.")
        Text(text = "•  Derivación a programas de inserción sociolaboral.\n•  Derivación a otros servicios especializados: salud, educación, etc.\n•  Colaboración y trabajo en red con otras entidades y asociaciones de barrio que ofrecen apoyo en distintos ámbitos: cultura, arte, derechos a la vivienda, deporte, feminismo, personas migrantes.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}