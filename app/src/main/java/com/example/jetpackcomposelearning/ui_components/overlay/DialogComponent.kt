package com.example.jetpackcomposelearning.ui_components.overlay

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DialogComponent(onBackClick: () -> Unit) {

    OverlayScreen(
        title = "Dialog Demo",
        onBackClick = onBackClick
    ) {

        var showDialog by remember { mutableStateOf(false) }
        var resultText by remember { mutableStateOf("No action performed yet.") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Dialog is a custom popup component that appears above the current screen.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Unlike AlertDialog, Dialog does not provide title, message, or buttons automatically. We design everything inside it ourselves.",
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Current Result: $resultText",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { showDialog = true }
            ) {
                Text("Open Dialog")
            }

            if (showDialog) {
                Dialog(
                    onDismissRequest = {
                        showDialog = false
                        resultText = "Dialog dismissed by tapping outside or pressing back."
                    }
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                    ) {
                        Column(
                            modifier = Modifier.padding(20.dp),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {

                            Text(
                                text = "Custom Dialog",
                                fontSize = 20.sp
                            )

                            Text(
                                text = "This is a Dialog example. Dialog is used when developers want complete control over the popup UI.",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "In this example, the dialog content is built manually using Card, Column, Text, and Buttons.",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "Press Confirm to perform an action or Close to dismiss the dialog.",
                                fontSize = 15.sp
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Button(
                                onClick = {
                                    resultText = "Confirm button clicked."
                                    showDialog = false
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text("Confirm")
                            }

                            TextButton(
                                onClick = {
                                    resultText = "Dialog closed using Close button."
                                    showDialog = false
                                },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text("Close")
                            }
                        }
                    }
                }
            }
        }
    }
}