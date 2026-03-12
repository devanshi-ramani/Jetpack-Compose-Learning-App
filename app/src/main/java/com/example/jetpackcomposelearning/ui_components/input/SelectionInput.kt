package com.example.jetpackcomposelearning.ui_components.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SelectionInput(onBackClick: () -> Unit) {

    InputScreen(
        title = "Selection Components",
        onBackClick = onBackClick
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoCard(
                title = "Radio Button",
                description = "Used when the user must select only ONE option from a group."
            ) {

                var selectedOption by remember { mutableStateOf("Male") }

                Column {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = selectedOption == "Male",
                            onClick = { selectedOption = "Male" }
                        )
                        Text("Male")
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = selectedOption == "Female",
                            onClick = { selectedOption = "Female" }
                        )
                        Text("Female")
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = selectedOption == "Other",
                            onClick = { selectedOption = "Other" }
                        )
                        Text("Other")
                    }

                }
            }


            DemoCard(
                title = "Checkbox",
                description = "Used when the user can select MULTIPLE options."
            ) {

                var kotlinChecked by remember { mutableStateOf(false) }
                var javaChecked by remember { mutableStateOf(false) }
                var pythonChecked by remember { mutableStateOf(false) }

                Column {

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = kotlinChecked,
                            onCheckedChange = { kotlinChecked = it }
                        )
                        Text("Kotlin")
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = javaChecked,
                            onCheckedChange = { javaChecked = it }
                        )
                        Text("Java")
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = pythonChecked,
                            onCheckedChange = { pythonChecked = it }
                        )
                        Text("Python")
                    }

                }
            }

        }
    }
}