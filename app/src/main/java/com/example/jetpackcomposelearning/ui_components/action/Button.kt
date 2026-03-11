package com.example.jetpackcomposelearning.ui_components.action

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40

@Composable
fun ButtonDemoScreen(onBackClick: () -> Unit) {
    ActionScreen(
        title = "Button Components",
        onBackClick = onBackClick
    ) {
        var primaryMessage by remember { mutableStateOf("") }
        var outlinedMessage by remember { mutableStateOf("") }
        var textMessage by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoButtonCard(
                title = "Button",
                description = "Standard filled button used for primary actions."
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Button(onClick = {
                        primaryMessage = "Primary action executed"
                    }) {
                        Text("Primary Button")
                    }

                    if (primaryMessage.isNotEmpty()) {
                        Text(
                            text = primaryMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoButtonCard(
                title = "Outlined Button",
                description = "Button with border used for secondary actions."
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    OutlinedButton(onClick = {
                        outlinedMessage = "Secondary action executed"
                    }) {
                        Text("Outlined Button")
                    }

                    if (outlinedMessage.isNotEmpty()) {
                        Text(
                            text = outlinedMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoButtonCard(
                title = "Text Button",
                description = "Lightweight button used for low emphasis actions."
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    TextButton(onClick = {
                        textMessage = "Lightweight action executed"
                    }) {
                        Text("Text Button")
                    }

                    if (textMessage.isNotEmpty()) {
                        Text(
                            text = textMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DemoButtonCard(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
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