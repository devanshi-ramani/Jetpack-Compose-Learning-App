package com.example.jetpackcomposelearning.ui_components.action

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
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

@Composable
fun FloatingButtonScreen(onBackClick: () -> Unit) {
    ActionScreen(
        title = "Floating Action Buttons",
        onBackClick = onBackClick
    ) {
        var fabMessage by remember { mutableStateOf("") }
        var smallFabMessage by remember { mutableStateOf("") }
        var largeFabMessage by remember { mutableStateOf("") }
        var extendedFabMessage by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoButtonCard(
                title = "Floating Action Button",
                description = "Standard FAB used for primary screen actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FloatingActionButton(
                        onClick = {
                            fabMessage = "New item created"
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "Add"
                        )
                    }

                    if (fabMessage.isNotEmpty()) {
                        Text(
                            text = fabMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoButtonCard(
                title = "Large Floating Action Button",
                description = "Larger FAB used to emphasize important actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LargeFloatingActionButton(
                        onClick = {
                            largeFabMessage = "Edit action started"
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "Edit",
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    if (largeFabMessage.isNotEmpty()) {
                        Text(
                            text = largeFabMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoButtonCard(
                title = "Small Floating Action Button",
                description = "Smaller FAB used for quick secondary actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SmallFloatingActionButton(
                        onClick = {
                            smallFabMessage = "Added to favorites"
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "Favorite"
                        )
                    }

                    if (smallFabMessage.isNotEmpty()) {
                        Text(
                            text = smallFabMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }

            DemoButtonCard(
                title = "Extended Floating Action Button",
                description = "FAB with icon and text for clearer actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ExtendedFloatingActionButton(
                        onClick = {
                            extendedFabMessage = "Content shared successfully"
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "Share"
                            )
                        },
                        text = {
                            Text("Share")
                        }
                    )

                    if (extendedFabMessage.isNotEmpty()) {
                        Text(
                            text = extendedFabMessage,
                            fontSize = 14.sp,
                            color = PurpleGrey40
                        )
                    }
                }
            }
        }
    }
}