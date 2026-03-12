package com.example.jetpackcomposelearning.ui_components.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40


@Composable
fun TextFieldInput(onBackClick: () -> Unit) {
    InputScreen(
        title = "Text Components",
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
                title = "TextField",
                description = "Basic text input field used to enter simple text."
            ) {
                var text by remember { mutableStateOf("") }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    TextField(
                        value = text,
                        onValueChange = { text = it },
                        placeholder = { Text("Enter Name") }
                    )
                }
            }

            DemoCard(
                title = "Outlined TextField",
                description = "Text field with an outlined border style."
            ) {
                var email by remember { mutableStateOf("") }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    OutlinedTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Enter Email") }
                    )
                }
            }

            DemoCard(
                title = "Basic TextField",
                description = "Low-level text input used for custom UI design."
            ) {

                var text by remember { mutableStateOf("") }

                BasicTextField(
                    value = text,
                    onValueChange = { text = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
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
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = PurpleGrey40
            )

            Text(
                text = description,
                fontSize = 14.sp
            )

            content()
        }
    }
}
