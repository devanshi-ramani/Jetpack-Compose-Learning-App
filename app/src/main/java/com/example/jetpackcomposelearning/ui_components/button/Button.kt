package com.example.jetpackcomposelearning.ui_components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun ButtonDemoScreen(onBackClick: () -> Unit) {
    ButtonScreen(
        title = "Button Components",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoCard(
                title = "Filled button",
                description = "Filled button & Filled tonal button "
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Button(onClick = {}) {
                        Text("Filled")
                    }
                    FilledTonalButton(onClick = {}) {
                        Text("Tonal")
                    }
                }
            }

            DemoCard(
                title = "Outlined Button",
                description = "Button with border "
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    OutlinedButton(onClick = {}) {
                        Text("Outlined")
                    }
                }
            }

            DemoCard(
                title = "Elevated Button",
                description = "It appears as only text until pressed. It does not have a solid fill or outline by default"
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    ElevatedButton(onClick = {}) {
                        Text("Elevated")
                    }
                }
            }

            DemoCard(
                title = "Text Button",
                description = "It appears as only text until pressed. It does not have a solid fill or outline by default"
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    TextButton(
                        onClick = {}
                    ) {
                        Text("Text Button")
                    }
                }
            }
        }
    }
}
