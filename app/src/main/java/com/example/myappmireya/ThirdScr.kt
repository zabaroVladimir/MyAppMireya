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
fun ThirdScr(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 14.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {


        Text(text = "•  Bono de alquiler joven para jóvenes entre 18 y 35 años con contrato de alquiler o de habitación o en disposición de tenerlo.\n•  Ayudas al alquiler para personas mayores de 65 años o más que son titulares del contrato de alquiler.\n•  Ayudas al alquiler para personas entre 36 y 64 años titulares del contrato de alquiler.")
        Text(text = "•  Prestaciones para el pago de deudas de alquiler.\n•  Ayudas al pago al alquiler para personas en riesgo de exclusión social con contrato de alquiler.\n•\tPara tramitar la solicitud y poder acceder a vivienda de protección oficial.")
        Text(text = "•  PAE. Servicio de asesoramiento energético.Donde puedes tramitar elbono social, este bono permite aplicar un descuento del 25% al 40% en la factura de electricidad en función de la situación económica de cada persona.Asesoramiento cuando se produce un corte de suministro por impago porque la compañía energética ha infringido la ley.Teléfono:930008054.Horario de lunes a viernes de 9.00h a 14.00h")
        Text(text = "•  Alta empadronamiento\n•  Alta empadronamiento sin domicilio fijo\n•  Certificado del empadronamiento firmado por el secretario del Ayuntamiento.\n•  Talta de la tarjeta rosa: para todos los ciudadan@s empadronados en Barcelona que cumplan los baremos de ingresos económicos establecidos y que sean mayores de 60 años o bien tengan una discapacidad igual o superior al 33% acreditada. Da derecho a disfrutar de una infinidad de ventajas en cultura y ocio; salud ; belleza (peluquería y estética);  deportes y transporte público, entre muchos otros.")
        Text(text = "•  Licencia para la tenencia de perros potencialmente peligrosos.\n•  Alegaciones o recursos en relación con multas de tráfico impuestas por el Ayuntamiento de Barcelona.\n•  Alegaciones o recursos en relación con multas de convivencia impuestas por el Ayuntamiento de Barcelona.\n•  Registro Gaudir Més: descuentos en museos y lugares emblemáticos de Barcelona.\n•  Certificado negativo de sueldo o pensión del Ayuntamiento de Barcelona.\n•  Gestión TBC, trabajo en beneficio de la comunidad, para cancelación de pago de importe de multas gestionadas/cursadas por el ayuntamiento.")
        
        
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Devolver")
        }
    }
}