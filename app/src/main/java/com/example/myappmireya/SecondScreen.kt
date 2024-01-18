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
fun SecondScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "")
        Text(text = "¿Qué es? ", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Informan sobre recursos, prestaciones y servicios a los que tenéis derecho a acceder como ciudadanos de Barcelona. Para poder recibir prestaciones económicas, ayuda, orientación y asesoramiento en servicios de atención básica es necesario acudir a Serveis Socials.")
        Text(text = "https://ajuntament.barcelona.cat/serveissocials/ca/canal/serveis", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "¿Cómo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Llama al 010, te preguntarán tu dirección y te darán el teléfono del Serveis     Socials que corresponde a tu barrio, llámalos y pide una cita con fecha y hora en tu oficina del barrio. El día de la cita es aconsejable ir con una libreta donde poder tomar notas")
        Text(text = "¿Dónde?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Cada barrio de Barcelona tiene una oficina de Serveis Socials. En total hay 39 repartidas por la ciudad.")
        Text(text = "¿Cuándo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "De lunes a jueves de 9.0h a 19.00h. Viernes solo de 9.00h a 16.00h")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}