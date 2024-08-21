package com.example.miprimeraaplicacion




import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding




import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment




import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource




import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiPrimeraAplicacionTheme {

            }
        }
    }


    private fun MiPrimeraAplicacionTheme(function: () -> Unit) {
        TODO("Not yet implemented")
    }
}
@Composable
fun GreetingImage (nombre: String, modifier: Modifier = Modifier) {
    val image= painterResource(R.drawable.michiinge)
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Image(


            painter = image,
            contentDescription = null


        )
        Text(text = "Departamento Oficial de Michi Ingenieros ",
            fontSize = 20.sp,
            fontWeight =FontWeight.Normal,


            )
        Text(text = "This certificate is presented to:",
            fontSize = 20.sp,
            fontWeight =FontWeight.Normal,
        )


        Text(
            text = "$nombre",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
        

        Text(text = "has successufully completed a 2 hours course on")
        val course = "Fundamentos en tecnicas de programacion"
        Text(text = "$course",
            fontSize = 16.sp,
            fontWeight =FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )


        Text(text = "Firma de \n Miauntonio Mininospriu",
            fontSize = 16.sp,
            fontWeight =FontWeight.Normal,
            textAlign = TextAlign.Left,
            modifier = modifier.fillMaxWidth())


        Text(text = "Firma de \n Miaurmando Michivera",
            fontSize = 16.sp,
            fontWeight =FontWeight.Normal,
            textAlign = TextAlign.Right,
            modifier = modifier.fillMaxWidth())




    }
}


@Composable
fun Image(painter: Painter, contentDescription: Nothing?) {


}


fun image(painterResource: Painter) {
    TODO("Not yet implemented")
}


@Composable
@Preview (showBackground = true)
fun CertificatingCoursePreview(){
    GreetingImage(nombre = "Esmeralda Barrios Gonzalez " )







}

