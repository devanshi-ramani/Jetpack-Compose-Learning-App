package com.example.jetpackcomposelearning.ui_components.slider

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun SliderComponent() {
    val padding = 30.dp;
    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = " Sliders Examples ",
            modifier = Modifier.fillMaxWidth().padding(padding),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )
        DemoCard(
            title = " Basic Example ",
            description = "Below is basic example of Slider Composable "
        ) {
            var sliderPosition by remember { mutableFloatStateOf(0f) }
            Column {
                Slider(
                    value = sliderPosition,
                    onValueChange = { sliderPosition = it }
                )
                Text(text = sliderPosition.toString())
            }
        }

        DemoCard(
            title = "Advanced Implementation",
            description = "A slider with steps and a set value range."
        ) {
            var sliderPosition by remember { mutableFloatStateOf(0f) }
            Column {
                Slider(
                    value = sliderPosition,
                    onValueChange = { sliderPosition = it },
                    colors = SliderDefaults.colors(
                        thumbColor = MaterialTheme.colorScheme.secondary,
                        activeTrackColor = MaterialTheme.colorScheme.secondary,
                        inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                    ),
                    steps = 3,
                    valueRange = 0f..50f
                )
                Text(text = sliderPosition.toString())
            }
        }

        DemoCard(
            title = "Range Slider",
            description = " An implementation of a range slider."
        ) {
            var sliderPosition by remember { mutableStateOf(0f..100f) }
            Column {
                RangeSlider(
                    value = sliderPosition,
                    steps = 5,
                    onValueChange = { range -> sliderPosition = range },
                    valueRange = 0f..100f,
                    onValueChangeFinished = {},
                )
                Text(text = sliderPosition.toString())
            }
        }
    }
}


