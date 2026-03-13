package com.example.jetpackcomposelearning.ui_components.overlay

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DropMenuComponent(onBackClick: () -> Unit) {

    OverlayScreen(
        title = "DropdownMenu Demo",
        onBackClick = onBackClick
    ) {

        var expanded by remember { mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("No option selected yet.") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "DropdownMenu is an overlay component that shows a small menu attached to a button, icon, or any UI element.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "It is commonly used for overflow menus, three-dot menus, option selection, and small action lists.",
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "In this example, clicking the button opens a menu with three options.",
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Current Result: $selectedOption",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { expanded = true }
            ) {
                Text("Open Menu")
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = {
                    expanded = false
                    selectedOption = "Menu dismissed."
                }
            ) {

                DropdownMenuItem(
                    text = {
                        Text("Edit")
                    },
                    onClick = {
                        selectedOption = "Edit selected."
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("Delete")
                    },
                    onClick = {
                        selectedOption = "Delete selected."
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("Share")
                    },
                    onClick = {
                        selectedOption = "Share selected."
                        expanded = false
                    }
                )
            }
        }
    }
}