package com.example.jetpackcomposelearning.ui_components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun FloatingButtonScreen(onBackClick: () -> Unit) {
    ButtonScreen(
        title = "Floating Action Buttons",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DemoCard(
                title = "Floating Action Button",
                description = "Standard FAB used for primary screen actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    FloatingActionButton(
                        onClick = { },
                    ) {
                        Icon(Icons.Filled.Add, "Floating action button.")
                    }
                }
            }


            DemoCard(
                title = "Small Floating Button",
                description = "Smaller FAB used for quick secondary actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SmallFloatingActionButton(
                        onClick = {},
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        contentColor = MaterialTheme.colorScheme.secondary
                    ) {
                        Icon(Icons.Filled.Add, "Small floating action button.")
                    }
                }
            }

            DemoCard(
                title = "Large Floating Action Button",
                description = "Larger FAB used to emphasize important actions."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LargeFloatingActionButton(
                        onClick = {},
                        shape = CircleShape,
                    ) {
                        Icon(Icons.Filled.Add, "Large floating action button")
                    }
                }
            }

            DemoCard(
                title = "Extended Button",
                description = "Allows to create a button with more complex content that scales to fit its content appropriately ."
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ExtendedFloatingActionButton(
                        onClick = {},
                        icon = { Icon(Icons.Filled.Edit, "Extended floating action button.") },
                        text = { Text(text = "Extended FAB") },
                    )
                }
            }
        }
    }
}