package com.example.jetpackcomposelearning


import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true, showSystemUi = true)
@Composable
fun EntryScreen() {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalArrangement = Arrangement.Center
        ) { Text(" HOMESCREEN ", fontFamily = FontFamily.SansSerif,  fontSize = 28.sp)}

        Button(onClick = {  },
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth(0.9f).weight(0.05f).padding(10.dp)
        ){
            Text("Compose Fundamentals", fontSize = 20.sp)
        }
        Button(onClick = { },
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth(0.9f).weight(0.05f).padding(10.dp)
        ){
            Text("Layout System", fontSize = 20.sp)
        }
        Button(onClick = { },
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth(0.9f).weight(0.05f).padding(10.dp)
        ){
            Text("UI Components", fontSize = 20.sp)
        }
        Button(onClick = { },
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth(0.9f).weight(0.05f).padding(10.dp)
        ){
            Text("State Management", fontSize = 20.sp)
        }
        Button(onClick = { },
            shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth(0.9f).weight(0.05f).padding(10.dp)
        ){
            Text(" Lists & Navigation ", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(50.dp))
    }

}