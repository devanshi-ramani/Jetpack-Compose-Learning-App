package com.example.jetpackcomposelearning.ui_components.overlay

import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AlertDialogComponent(onBackClick: () -> Unit) {
    OverlayScreen(
        title = "AlertDialog Demo",
        onBackClick = onBackClick
    ) {

        var showDialog by remember { mutableStateOf(false) }
        var message by remember { mutableStateOf("Click delete to show dialog") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(message)

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    showDialog = true
                }
            ) {
                Text("Delete Item")
            }

            if (showDialog) {

                AlertDialog(

                    onDismissRequest = {
                        showDialog = false
                    },

                    title = {
                        Text("Delete Confirmation")
                    },

                    text = {
                        Text("Are you sure you want to delete this item?")
                    },

                    confirmButton = {
                        Button(
                            onClick = {
                                message = "Item Deleted"
                                showDialog = false
                            }
                        ) {
                            Text("Delete")
                        }
                    },

                    dismissButton = {
                        Button(
                            onClick = {
                                message = "Deletion Cancelled"
                                showDialog = false
                            }
                        ) {
                            Text("Cancel")
                        }
                    }
                )
            }
        }
    }
}
