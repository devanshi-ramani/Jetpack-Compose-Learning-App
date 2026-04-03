package com.example.jetpackcomposelearning.ui_components.spacer

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun SpacerComponent(navController: NavController) {
    val padding = 20.dp;
    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Button(
            onClick = {
                navController.navigate(MyNavRoutes.UIComponents)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Pink80)
        ) {
            Text("Back")
        }
        Text(
            text = " Spacer Examples ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )
        DemoCard(
            title = "Vertical Spacer",
            description = "Used to create vertical space between elements such as text fields or buttons in forms."
        ) {

            Column {
                Text("Username")

                Spacer(modifier = Modifier.height(16.dp))

                Text("Password")
            }
        }

        DemoCard(
            title = "Horizontal Spacer",
            description = "Used to create space between items placed in a row such as icons or buttons."
        ) {

            Row {
                Text("Like")

                Spacer(modifier = Modifier.width(20.dp))

                Text("Share")
            }
        }

        DemoCard(
            title = "Spacer with Weight",
            description = "Used to push elements apart. Commonly used in toolbars and layouts."
        ) {

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Left")
                Spacer(modifier = Modifier.weight(1f))
                Text("Middle")
                Spacer(modifier = Modifier.weight(2f))
                Text("Right")
            }
        }
    }
}
