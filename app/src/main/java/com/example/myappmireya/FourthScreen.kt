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
fun FourthScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        //Hola
        Text(text = "")
        Text(text = "HABITATGE", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "¿Qué es?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "En la oficina de Habitatge nos asesoran sobre temas de vivienda: para tramitar ayudas de pago al alquiler, tramitar la solicitud para poder acceder a vivienda protección oficial , solicitar reducciones en el pago de la factura de electricidad, mediación.")
        Text(text = "¿Cómo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Solo atienden presencialmente con cita previa. La cita previa se solicita a través de internet, en la Oficina virtual de tràmits: https://seuelectronica.ajuntament.barcelona.cat/oficinavirtual/ca/tramit/20200001396")
        Text(text = "¿Dónde?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Cada distrito tiene su propia oficina de Habitatge.")
        Text(text = "¿Cuándo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Una vez pedida la cita previa atienden de lunes a viernes de 8:30h a 14:30 h. y jueves de 8:30 a 18:00 h.")
        Text(text = "OAC. OFICINA D’Atenció Ciutadana", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "¿Qué es?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Oficina donde te ofrecen información personalizada y puedes llevar a cabo diversas https://ajuntament.barcelona.cat/serveiatenciociutadana/es/tramites")
        Text(text = "¿Cómo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Pedir cita previa llamando al 010 o bien solicitando cita previa online https://seuelectronica.ajuntament.barcelona.cat/APPS/portaltramits/formulari/ptbcitaprevia/T128/init/ca/PTCIU.html?")
        Text(text = "¿Dónde?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Cada distrito tiene su propia Oficina de Atención Ciudadadana.")
        Text(text = "¿Cuándo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "De lunes a viernes  8.30h a18.30h. La OAC de Plaza Sant Miquel  cierra a las 20h gestiones y trámites municipales.")
        
        
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}