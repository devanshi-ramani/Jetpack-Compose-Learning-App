package com.example.jetpackcomposelearning.ui_components.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun CheckboxComponent() {
    val padding = 30.dp
    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = " Checkbox Examples ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )

        DemoCard(
            title = "Minimal Example",
            description = "Checkboxes let users select one or more items from a list. "
        ) {
            var checked by remember { mutableStateOf(true) }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Minimal checkbox")
                Checkbox(
                    checked = checked,
                    onCheckedChange = { checked = it }
                )
            }

            Text(
                if (checked) "Checkbox is checked" else "Checkbox is unchecked"
            )
        }

        DemoCard(
            title = "Advanced Example",
            description = "Below is advanced version for checkbox selection."
        ) {
            val childCheckedStates = remember { mutableStateListOf(false, false, false) }

            val parentState = when {
                childCheckedStates.all { it } -> ToggleableState.On
                childCheckedStates.none { it } -> ToggleableState.Off
                else -> ToggleableState.Indeterminate
            }

            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Select all")
                    TriStateCheckbox(
                        state = parentState,
                        onClick = {
                            val newState = parentState != ToggleableState.On
                            childCheckedStates.forEachIndexed { index, _ ->
                                childCheckedStates[index] = newState
                            }
                        }
                    )
                }

                childCheckedStates.forEachIndexed { index, checked ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Option ${index + 1}")
                        Checkbox(
                            checked = checked,
                            onCheckedChange = { isChecked ->
                                childCheckedStates[index] = isChecked
                            }
                        )
                    }
                }
            }

            if (childCheckedStates.all { it }) {
                Text("All options selected")
            }
        }
    }
}