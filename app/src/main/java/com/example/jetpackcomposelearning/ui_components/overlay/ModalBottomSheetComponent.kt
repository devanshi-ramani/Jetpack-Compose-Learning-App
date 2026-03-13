package com.example.jetpackcomposelearning.ui_components.overlay

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetComponent(onBackClick: () -> Unit) {

    OverlayScreen(
        title = "ModalBottomSheet Demo",
        onBackClick = onBackClick
    ) {

        var showBottomSheet by remember { mutableStateOf(false) }
        var selectedOption by remember { mutableStateOf("No option selected yet.") }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "ModalBottomSheet is an overlay component that slides up from the bottom of the screen.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "It is commonly used to show multiple actions or choices, such as share options, filter options, or upload actions.",
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "In this example, clicking the button opens a bottom sheet with three options.",
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Current Result: $selectedOption",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { showBottomSheet = true }
            ) {
                Text("Open Bottom Sheet")
            }

            if (showBottomSheet) {
                ModalBottomSheet(
                    onDismissRequest = {
                        showBottomSheet = false
                        selectedOption = "Bottom sheet dismissed."
                    }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {

                        Text(
                            text = "Choose an Option",
                            fontSize = 20.sp
                        )

                        Text(
                            text = "This bottom sheet is used to show actions from the bottom of the screen.",
                            fontSize = 15.sp
                        )

                        Text(
                            text = "Tap any option below to perform an action and close the sheet.",
                            fontSize = 15.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = {
                                selectedOption = "Take Photo selected."
                                showBottomSheet = false
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Take Photo")
                        }

                        Button(
                            onClick = {
                                selectedOption = "Choose from Gallery selected."
                                showBottomSheet = false
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Choose from Gallery")
                        }

                        Button(
                            onClick = {
                                selectedOption = "Upload File selected."
                                showBottomSheet = false
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Upload File")
                        }

                        TextButton(
                            onClick = {
                                selectedOption = "Bottom sheet closed using Close button."
                                showBottomSheet = false
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Close")
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }
            }
        }
    }
}