package com.example.jetpackcomposelearning.fundamentals.display

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextDemoScreen(onBackClick: () -> Unit) {
    var isClicked by remember { mutableStateOf(false) }

    DisplayScreen(
        title = "Text Components",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

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
}
