package com.example.jetpackcomposelearning.ui_components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.OutlinedIconButton
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
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard


@Composable
fun IconButtonScreen(onBackClick: () -> Unit) {
    ButtonScreen(
        title = "Icon Button Components",
        onBackClick = onBackClick
    ) {
        var iconMessage by remember { mutableStateOf("") }
        var filledMessage by remember { mutableStateOf("") }
        var outlinedMessage by remember { mutableStateOf("") }
        var checked by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoCard(
                title = "Icon Button",
                description = "Basic icon button used for simple actions."
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconButton(
                        onClick = {
                            iconMessage = "Add action executed"
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    if (iconMessage.isNotEmpty()) {
                        Text(
                            text = iconMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoCard(
                title = "Filled Icon Button",
                description = "Icon button with a filled background."
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    FilledIconButton(
                        onClick = {
                            filledMessage = "Favorite action executed";
                            filledMessage = "Favorite action executed"
                        },
                        colors = IconButtonDefaults.filledIconButtonColors(
                            containerColor = PurpleGrey40
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite"
                        )
                    }

                    if (filledMessage.isNotEmpty()) {
                        Text(
                            text = filledMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoCard(
                title = "Outlined Icon Button",
                description = "Icon button with an outlined border."
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    OutlinedIconButton(
                        onClick = {
                            outlinedMessage = "Settings opened"
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Settings"
                        )
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

            DemoCard(
                title = "Icon Toggle Button",
                description = "Icon button that toggles between two states."
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    IconToggleButton(
                        checked = checked,
                        onCheckedChange = { checked = it }
                    ) {
                        Icon(
                            imageVector = if (checked) Icons.Default.Favorite else Icons.Default.Add,
                            contentDescription = "Toggle"
                        )
                    }

                    Text(
                        text = if (checked) "Added to Favorites" else "Removed from Favorites",
                        fontSize = 14.sp,
                        color = PurpleGrey40
                    )
                }
            }
        }
    }
}