package com.example.jetpackcomposelearning.ui_components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40

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

            DemoTextCard(
                title = "Simple Text",
                description = "Displays textual information on the screen."
            ) {
                Text(
                    text = "Hello Jetpack Compose",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }

            DemoTextCard(
                title = "AnnotatedString Text",
                description = "Used when one text needs multiple styles."
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Learn ")
                        withStyle(
                            style = SpanStyle(
                                color = Color.Red,
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

            DemoTextCard(
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

@Composable
fun DemoTextCard(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = PurpleGrey40
            )

            Text(
                text = description,
                fontSize = 14.sp
            )

            content()
        }
    }
}