package com.example.myappmireya

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myappmireya.ui.theme.MyAppMireyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "main_screen") {
                composable("main_screen") { MainScreen(navController) }
                composable("second_screen") { SecondScreen(navController) }
                composable("third_screen") { ThirdScreen(navController) }
                composable("fourth_screen") { FourthScreen(navController) }
                composable("fifth_screen") { FifthScreen(navController) }
                composable("first_1") { FirstScr(navController) }
                composable("second_2") { SecondScr(navController) }
                composable("third_3") { ThirdScr(navController) }
                composable("fourth_4") { FourthScr(navController) }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {


    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.pi),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        Image(
            painter = painterResource(id = R.drawable.derechos),
            contentDescription = null,
            modifier = Modifier
                .offset(x = 100.dp, y = 5.dp)
                .size(200.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.provivienda),
            contentDescription = null,
            modifier = Modifier
                .offset(x = 115.dp, y = 630.dp)
                .size(200.dp)
        )
        //1
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = (-7).dp, y = 210.dp)) {
            Box(modifier = Modifier
                .size(120.dp)

                .clickable { navController.navigate("second_screen") }) {} }
        //1.
        //1?
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = (124).dp, y = 263.dp)) {
            Box(modifier = Modifier
                .size(40.dp)

                .clickable { navController.navigate("first_1") }) {} }
        //1?.
        //2
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = 265.dp, y = 209.dp)) { Box(modifier = Modifier
            .size(120.dp)

            .clickable { navController.navigate("third_screen") }) {} }
        //2.
        //2?
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = 286.dp, y = 341.dp)) { Box(modifier = Modifier
            .size(40.dp)

            .clickable { navController.navigate("second_2") }) {} }
        //2?.
        //3
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = (-7).dp, y = 480.dp)) { Box(modifier = Modifier
            .size(120.dp)

            .clickable { navController.navigate("fourth_screen") }) {} }
        //3.
        //3?
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = 54.dp, y = 430.dp)) { Box(modifier = Modifier
            .size(40.dp)

            .clickable { navController.navigate("third_3") }) {} }
        //3?.
        //4
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = 265.dp, y = 480.dp)) { Box(modifier = Modifier
                    .size(120.dp)

                    .clickable { navController.navigate("fifth_screen")}) {} }
        //4.
        //4?
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .offset(x = 215.dp, y = 513.dp)) { Box(modifier = Modifier
            .size(40.dp)

            .clickable { navController.navigate("fourth_4") }) {} }
        //4?.
        }
    }


@Preview(showBackground = true)
@Composable
fun PreviewMainActivity() {
    MyAppMireyaTheme {

    }
}