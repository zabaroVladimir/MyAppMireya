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
fun FifthScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "")
        Text(text = "¿Qué es?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Barcelona cuenta con una amplia red de asociaciones. Existen más de 5000 asociaciones de todo tipo registradas en la ciudad. Muchos funcionan como canales solidarios, de cooperación y ayuda entre vecinos respecto a temas de vivienda, racismo, familia, sinhogarismo, feminismo, cuidado y acogida de animales… pero también son un instrumento para generar vínculos con el vecindario y una manera de participacipar y arraigar en el barrio, formar parte de grupos de personas que montan  las fiestas mayores, personas que realizan actividades gastronómicas (en la calle, en centros cívicos…)  educativas (en escuelas, centros cívicos) solidarias y de voluntariado (ayuda y cooperación), culturales (música, lectura, juegos de mesa), artísticas (asociaciones de pintores,danza, manualidades), deportivas (fútbol, petanca, ajedrez, Ping Pong…) asociaciones políticas, feministas, LGTBI+")
        Text(text = "¿Cómo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Si, por ejemplo, te gusta jugar al ajedrez, pregunta en el Centro Cívico de tu barrio, en la biblioteca o en Servicios sociales si conocen alguna asociación de ajedrecistas, o algún lugar donde poder jugar al ajedrez.")
        Text(text = "¿Dónde?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Pregunta a tus vecinos, en los Centros cívicos, en Servicios sociales, en las bibliotecas de tu barrio y BUSCA INFORMACIÓN en internet. Consigue el teléfono,  o bien acércate al local de la asociación y pide información!")
        Text(text = "¿Cuándo?", style = TextStyle(fontWeight = FontWeight.Bold))
        Text(text = "Cada asociación tiene horarios y días de atención diferentes.")
        
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}