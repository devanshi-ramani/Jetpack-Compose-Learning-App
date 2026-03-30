package com.example.jetpackcomposelearning.ui_components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun SegmentedButtonScreen (onBackClick:() -> Unit) {
    ButtonScreen(
        title = "Segmented Buttons",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            DemoCard(
                title = "Single-select segmented button",
                description = " Lets users choose one option. "
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    var selectedIndex by remember { mutableIntStateOf(0) }
                    val options = listOf("Day", "Month", "Week")

                    SingleChoiceSegmentedButtonRow {
                        options.forEachIndexed { index, label ->
                            SegmentedButton(
                                shape = SegmentedButtonDefaults.itemShape(
                                    index = index,
                                    count = options.size
                                ),
                                onClick = { selectedIndex = index },
                                selected = index == selectedIndex,
                                label = { Text(label) }
                            )
                        }
                    }
                }
            }


            DemoCard(
                title = "Multi-select segmented button",
                description = "Lets users choose between two and five items. "
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    val selectedOptions = remember {
                        mutableStateListOf(false, false, false)
                    }
                    val options = listOf("Walk", "Ride", "Drive")

                    MultiChoiceSegmentedButtonRow {
                        options.forEachIndexed { index, label ->
                            SegmentedButton(
                                shape = SegmentedButtonDefaults.itemShape(
                                    index = index,
                                    count = options.size
                                ),
                                checked = selectedOptions[index],
                                onCheckedChange = {
                                    selectedOptions[index] = !selectedOptions[index]
                                },
                                icon = { SegmentedButtonDefaults.Icon(selectedOptions[index]) },
                                label = {
                                    when (label) {
                                        "Walk" -> Icon(
                                            imageVector =
                                                Icons.AutoMirrored.Filled.DirectionsWalk,
                                            contentDescription = "Directions Walk"
                                        )

                                        "Ride" -> Icon(
                                            imageVector =
                                                Icons.Default.DirectionsBus,
                                            contentDescription = "Directions Bus"
                                        )

                                        "Drive" -> Icon(
                                            imageVector =
                                                Icons.Default.DirectionsCar,
                                            contentDescription = "Directions Car"
                                        )
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}