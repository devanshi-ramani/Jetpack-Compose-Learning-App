package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun WeightDemoScreen(onBackClick: () -> Unit) {
    DemoScreen(
        title = "Weight Demo",
        onBackClick = onBackClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text("1f")
            }

            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxSize()
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ) {
                Text("2f")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text("The second box takes more space because its weight is 2f.")
    }
}