package com.example.jetpackcomposelearning.ui_components.text

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun TextDemoScreen(navController: NavController) {
    val padding = 30.dp;
    var isClicked by remember { mutableStateOf(false) }

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
            text = "Text Examples ",
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
            title = "Simple Text",
            description = "Displays textual information on the screen."
        ) {
            Text(
                text = "Welcome to learning Jetpack Compose",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
        }

        DemoCard(
            title = "AnnotatedString Text",
            description = "Used when one text needs multiple styles."
        ) {
            Text(
                text = buildAnnotatedString {
                    append("You can learn ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    ) {
                        append("Jetpack Compose")
                    }
                    append(" easily")
                }
            )
        }

        DemoCard(
            title = "Clickable Text",
            description = "Text that responds to user clicks."
        ) {
            Text(
                text = "Click here",
                color = if (isClicked) Color.Red else Color.Blue,
                modifier = Modifier.clickable {
                    isClicked = !isClicked
                }
            )
        }
    }
}
