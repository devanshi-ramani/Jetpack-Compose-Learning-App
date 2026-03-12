package com.example.jetpackcomposelearning.ui_components.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SliderInput(onBackClick: () -> Unit) {

    InputScreen(
        title = "Slider Component",
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
                title = "Basic Slider",
                description = "Allows users to select a value from a continuous range."
            ) {

                var sliderValue by remember { mutableFloatStateOf(0.5f) }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Value: ${(sliderValue * 100).toInt()}%",
                        fontSize = 16.sp
                    )

                    Slider(
                        value = sliderValue,
                        onValueChange = { sliderValue = it },
                        modifier = Modifier.fillMaxWidth(0.9f)
                    )
                }
            }


            DemoCard(
                title = "Stepped Slider",
                description = "Slider that moves in fixed steps instead of continuous values."
            ) {

                var value by remember { mutableFloatStateOf(0f) }

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Selected: ${value.toInt()}",
                        fontSize = 16.sp
                    )

                    Slider(
                        value = value,
                        onValueChange = { value = it },
                        valueRange = 0f..10f,
                        steps = 9,
                        modifier = Modifier.fillMaxWidth(0.9f)
                    )
                }
            }

        }
    }
}