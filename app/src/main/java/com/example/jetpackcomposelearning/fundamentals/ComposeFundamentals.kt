package com.example.jetpackcomposelearning.fundamentals

import androidx.compose.material3.Card
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground =true, showSystemUi = true)
@Composable
fun ComposeFundamentals() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text(
                text = "Compose Fundamentals",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }

        item {
            DemoCard(title = "Simple Text") {
                SimpleTextDemo()
            }
        }

        item {
            DemoCard(title = "Button") {
                ButtonDemo()
            }
        }

        item {
            DemoCard(title = "Image") {
                ImageDemo()
            }
        }

        item {
            DemoCard(title = "Modifier") {
                ModifierDemo()
            }
        }

        item {
            DemoCard(title = "Padding") {
                PaddingDemo()
            }
        }

        item {
            DemoCard(title = "Background") {
                BackgroundDemo()
            }
        }

        item {
            DemoCard(title = "Clickable") {
                ClickableDemo()
            }
        }

        item {
            DemoCard(title = "Spacer") {
                SpacerDemo()
            }
        }

        item {
            DemoCard(title = "Reusable Composable") {
                ReusableComposableDemo()
            }
        }

        item {
            DemoCard(title = "Passing Properties to Composables") {
                PassingPropertiesDemo()
            }
        }
    }
}

@Composable
fun DemoCard(
    title: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(12.dp))

            content()
        }
    }
}
