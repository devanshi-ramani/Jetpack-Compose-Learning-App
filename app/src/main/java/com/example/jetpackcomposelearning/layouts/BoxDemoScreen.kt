package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BoxDemoScreen(onBackClick: () -> Unit) {
    DemoScreen(
        title = "Box Demo",
        onBackClick = onBackClick
    ) {
        Box(
            modifier = Modifier
                .size(220.dp)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Text in Box Center",
                fontWeight = FontWeight.Bold
            )
        }
    }
}