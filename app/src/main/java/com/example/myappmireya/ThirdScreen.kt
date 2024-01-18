package com.example.myappmireya


import android.annotation.SuppressLint
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ThirdScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

                Text(text = "")
                Text(text = "¿Qué es? ", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "SARA Y PIAD son dos servicios distintos, pero comparten centralita telefónica. Ofrecen información y orientación sobre asesoramiento integral a la mujer (Piad) y asesoramiento integral y protección específica  a mujeres víctimas de violencia machista (Sara)")
                Text(text = "¿Cómo?", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "Se puede acceder directamente a través de cita previa llamando al teléfono gratuito 900 922 357 o derivación desde Servicios Sociales. sara@bcn.cat")
                Text(text = "¿Dónde?", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "C/Marie Curie, 16, 08042 Barcelona. Nou Barris.")
                Text(text = "¿Cuándo?", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "De lunes a jueves de 9 a 14 h. y de 16 a 19 h. y viernes de 9.00h a 16.00h")
                Text(text = "https://ajuntament.barcelona.cat/dones/ca/informacio-i-atencio/a-les-dones/punts-informacio-i-atencio-a-les-dones-piad", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "https://ajuntament.barcelona.cat/dones/sites/default/files/documents/piad_diptic_v2023_1_.pdf", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "Mujeres: recomendaciones de seguridad y prevención, y una guía sobre cómo actuar en caso de que se produzca una agresión.\nComunidades y vecindario: pautas sobre cómo actuar si se detecta un posible caso de violencia machista en el entorno de la comunidad.\nComercios: recomendaciones en caso de detectar un caso de violencia machista que afecte a una clienta.")
                Text(text = "https://ajuntament.barcelona.cat/dones/es/bcn-antimachista/servicios-de-atencion-la-violencia-machista/sara", style = TextStyle(fontWeight = FontWeight.Bold))
                Text(text = "https://ajuntament.barcelona.cat/dones/sites/default/files/documents/que_fer_dona_cast_1_0.pdf", style = TextStyle(fontWeight = FontWeight.Bold))
        
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigateUp() }) {
                    Text("Devolver")
                }
    }
}