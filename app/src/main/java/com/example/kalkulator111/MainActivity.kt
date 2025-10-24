package com.example.kalkulator111

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kalkulator111.ui.theme.Kalkulator111Theme
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kalkulator111Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    KalkulatorApp()
                }
            }
        }
    }
}

@Composable
fun TombolKalk(text: String, modifier: Modifier = Modifier, fontSize: TextUnit = TextUnit.Unspecified){
    Button(onClick = { println("Button clicked") },
        modifier = modifier) {
        Text(text = text, fontSize = fontSize)
    }

}
@Preview
@Composable
fun KalkulatorApp(){
    Column {

        Text(
            text = "Kalkulator",
            color = Color.LightGray,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)
        )

        Text(
            text = "0",
            textAlign = TextAlign.End,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            color = Color.Black,
            maxLines = 1
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp))
        {  //fillmaxwidth mengisi lebar layar, arrangement spacedby memberi jarak tetap di antara komponen row
            TombolKalk(text = "C", modifier = Modifier.weight(1f))
            TombolKalk(text = "DEL", modifier = Modifier.weight(1f))
            TombolKalk(text = "%", modifier = Modifier.weight(1f))
            TombolKalk(text = "/", modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp))
        {
            TombolKalk(text = "7", modifier = Modifier.weight(1f))
            TombolKalk(text = "8", modifier = Modifier.weight(1f))
            TombolKalk(text = "9", modifier = Modifier.weight(1f))
            TombolKalk(text = "x", modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp))
        {
            TombolKalk(text = "4", modifier = Modifier.weight(1f))
            TombolKalk(text = "5", modifier = Modifier.weight(1f))
            TombolKalk(text = "6", modifier = Modifier.weight(1f))
            TombolKalk(text = "-", modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp))
        {
            TombolKalk(text = "1", modifier = Modifier.weight(1f))
            TombolKalk(text = "2", modifier = Modifier.weight(1f))
            TombolKalk(text = "3", modifier = Modifier.weight(1f))
            TombolKalk(text = "+", modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(16.dp))
        {
            TombolKalk(text = "0", modifier = Modifier.weight(2f))
            TombolKalk(text = ",", modifier = Modifier.weight(1f))
            TombolKalk(text = "=", modifier = Modifier.weight(1f))
        }
    }
}