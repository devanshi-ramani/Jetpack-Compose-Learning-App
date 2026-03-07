package com.example.jetpackcomposelearning

import androidx.compose.material3.Card
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
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

@Composable
fun SimpleTextDemo() {
    Text(
        text = "This is a simple text composable.",
        fontSize = 16.sp
    )
}

@Composable
fun ButtonDemo() {
    Button(onClick = { }) {
        Text(text = "Click Me")
    }
}

@Composable
fun ImageDemo() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Demo Image",
        modifier = Modifier.size(80.dp),
        contentScale = ContentScale.Fit
    )
}

@Composable
fun ModifierDemo() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Cyan),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box")
    }
}

@Composable
fun PaddingDemo() {
    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .padding(20.dp)
    ) {
        Text(text = "Text with padding")
    }
}

@Composable
fun BackgroundDemo() {
    Text(
        text = "Text with background",
        modifier = Modifier
            .background(Color.Yellow)
            .padding(8.dp)
    )
}

@Composable
fun ClickableDemo() {
    var message by remember { mutableStateOf("Tap the box") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFE1BEE7))
            .clickable {
                message = "Box clicked"
            }
            .padding(16.dp)
    ) {
        Text(text = message)
    }
}

@Composable
fun SpacerDemo() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Start")
        Spacer(modifier = Modifier.width(30.dp))
        Text(text = "End")
    }
}

@Composable
fun ReusableComposableDemo() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        GreetingCard(name = "Devanshi")
        GreetingCard(name = "Student")
    }
}

@Composable
fun GreetingCard(name: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFD0F0C0))
            .padding(12.dp)
    ) {
        Text(text = "Hello, $name")
    }
}

@Composable
fun PassingPropertiesDemo() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        InfoCard(title = "Name", value = "Devanshi")
        InfoCard(title = "Course", value = "BTech Computer Science")
    }
}

@Composable
fun InfoCard(title: String, value: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFF9C4))
            .padding(12.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
        Text(text = value)
    }
}