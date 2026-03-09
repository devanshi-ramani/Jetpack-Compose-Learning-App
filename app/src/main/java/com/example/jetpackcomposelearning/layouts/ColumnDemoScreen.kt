package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ColumnDemoScreen(onBackClick: () -> Unit) {
    DemoScreen(
        title = "Column Demo",
        onBackClick = onBackClick
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            elevation = CardDefaults.cardElevation(6.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Devanshi")
                Text("Ramani")
                Text("is")
                Text("an")
                Text("intern")

            }
        }
    }
}


