package com.example.jetpackcomposelearning.ui_components.menus

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Help
import androidx.compose.material.icons.automirrored.outlined.OpenInNew
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Feedback
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun MenuComponent(navController: NavController) {
    val padding = 30.dp;
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
            text = " Menu Examples ",
            modifier = Modifier.fillMaxWidth().padding(padding),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )

        DemoCard(
            title = "Basic Dropdown Menu",
            description = "Demonstrates a minimal DropdownMenu implementation."
        ) {
            var expanded by remember { mutableStateOf(false) }
            Box(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More options")
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("Option 1") },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text("Option 2") },
                        onClick = {}
                    )
                }
            }
        }

        DemoCard(
            title = "Long Dropdown Menu",
            description = " DropdownMenu is scrollable by default if all the menu items can't be displayed at once "
        ) {
            var expanded by remember { mutableStateOf(false) }
            val menuItemData = List(100) { "Option ${it + 1}" }

            Box(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More options")
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    menuItemData.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {}
                        )
                    }
                }
            }
        }

        DemoCard(
            title = "Advance Dropdown",
            description = "Advanced implementation of a drop-down menu. "
        ) {
            var expanded by remember { mutableStateOf(false) }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "More options")
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    // First section
                    DropdownMenuItem(
                        text = { Text("Profile") },
                        leadingIcon = { Icon(Icons.Outlined.Person, contentDescription = null) },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text("Settings") },
                        leadingIcon = { Icon(Icons.Outlined.Settings, contentDescription = null) },
                        onClick = {}
                    )

                    HorizontalDivider()

                    // Second section
                    DropdownMenuItem(
                        text = { Text("Send Feedback") },
                        leadingIcon = { Icon(Icons.Outlined.Feedback, contentDescription = null) },
                        trailingIcon = {
                            Icon(
                                Icons.AutoMirrored.Outlined.Send,
                                contentDescription = null
                            )
                        },
                        onClick = { }
                    )

                    HorizontalDivider()

                    // Third section
                    DropdownMenuItem(
                        text = { Text("About") },
                        leadingIcon = { Icon(Icons.Outlined.Info, contentDescription = null) },
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = { Text("Help") },
                        leadingIcon = {
                            Icon(
                                Icons.AutoMirrored.Outlined.Help,
                                contentDescription = null
                            )
                        },
                        trailingIcon = {
                            Icon(
                                Icons.AutoMirrored.Outlined.OpenInNew,
                                contentDescription = null
                            )
                        },
                        onClick = {}
                    )
                }
            }
        }
    }
}


