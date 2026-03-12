package com.example.jetpackcomposelearning.ui_components.structured

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardComponent(onBackClick: () -> Unit) {
    StructureScreen(
        title = "Card Component",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoCard(
                title = "Basic Card",
                description = "A simple container used to group related UI elements."
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFF3E5F5),
                        contentColor = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {
                    Text(
                        text = "Basic Card Content",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            DemoCard(
                title = "Clickable Card",
                description = "Card that responds to user interaction."
            ) {
                var cardMessage by remember { mutableStateOf("Tap this card") }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            cardMessage = "Card Clicked"
                        },
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFE3F2FD),
                        contentColor = Color.Black
                    ),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Text(
                        text = cardMessage,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            DemoCard(
                title = "Elevated Card",
                description = "Card with elevation to create shadow."
            ) {
                ElevatedCard(
                    modifier = Modifier.fillMaxWidth(),
                    shape = CutCornerShape(12.dp),
                    colors = CardDefaults.elevatedCardColors(
                        containerColor = Color(0xFFE8F5E9),
                        contentColor = Color.Black
                    ),
                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 10.dp
                    )
                ) {
                    Text(
                        text = "Elevated Card",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            DemoCard(
                title = "Outlined Card",
                description = "Card with a border to create separation without shadow. ."
            ) {
                OutlinedCard(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.outlinedCardColors(
                        containerColor = Color(0xFFFFF8E1),
                        contentColor = Color.Black
                    ),
                    border = BorderStroke(2.dp, Color.Gray)
                ) {
                    Text(
                        text = "Outlined Card",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun DemoCard(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = description,
                fontSize = 14.sp
            )

            content()
        }
    }
}