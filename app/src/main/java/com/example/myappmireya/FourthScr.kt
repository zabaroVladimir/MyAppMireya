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
fun FourthScr(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "")
        Text(text = "•  SINDICAT DE LLOGATERES. Asociación pro derechos a la vivienda. Asesoran y orientan  en tema de vivienda, deshaucios y contratos de alquiler.")
        Text(text = "https://sindicatdellogateres.org", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  Asociaciones sociales: ASSOCIACIO 9 BARRIS  ACULL.")
        Text(text = "https://9bacull.org/es", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  SOS RACISME . Asociacion anti racista: ")
        Text(text = "https://sosracisme.org/es/sos-racisme-es", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  Asociaciones LGTBI:Casal LAMBDA")
        Text(text = "https://lambda.cat", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  Red de huertos urbanos:")
        Text(text = " https://ajuntament.barcelona.cat/ecologiaurbana/ca/serveis/la-ciutat-funciona/manteniment-de-l-espai-public/gestio-del-verd-i-biodiversitat/horts-urban", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "•  PROGAT. Asociación de acogida De gatos. Tienen diversos proyectos en diferentes barrios de Barcelona de protección y acogida de gatos. Voluntariado.")




        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}