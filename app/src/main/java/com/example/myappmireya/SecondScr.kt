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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SecondScr(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Hola +-
        Text(text = "")
        Text(text = "SARA", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  Ofrece asistencia personalizada a mujeres víctimas de violencia de género.\n•  Asesoramiento jurídico.\n•  Asesoramiento psicológico.\n• Acceso a sistemas de protección específicos.\n•  Inserción laboral.")
        Text(text = "PIAD", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  Recursos laborales.\n•  Recursos formativos.\n•  Recursos personales.\n•  Aspectos relacionados con la legislación.\n•  Aspectos relacionados con la discriminación laboral o salarial.\n•  Asesoramiento violencia machista.\n•  Inserción laboral.\n•  Participación en espacios ocio, tiempo libre y de relación.\n• Asociacionismo femenino en entidades de mujeres del distrito.")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}