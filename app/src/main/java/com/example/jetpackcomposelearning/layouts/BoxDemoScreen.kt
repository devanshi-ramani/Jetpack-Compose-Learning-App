package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
        Card(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(all = 20.dp)
                        .size(200.dp)
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
    }
}
