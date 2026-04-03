package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun RowDemoScreen(onBackClick: () -> Unit) {

    DemoScreen(
        title = "Row Demo",
        onBackClick = onBackClick
    ) {

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                DemoCard(
                    "Arrangement.Start",
                    "Places all items at the start (left side) of the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Text("A ")
                        Text("B ")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.End",
                    "Places all items at the end (right side) of the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text("A ")
                        Text("B ")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.Center",
                    "Places items at the center horizontally inside the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text("Centered")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.SpaceBetween",
                    "Distributes items so the first item is at the start and the last item is at the end with equal space between them."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Left")
                        Text("Center")
                        Text("Right")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.SpaceAround",
                    "Adds equal space around each item. Items have space before and after them."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.SpaceEvenly",
                    "Places equal space between all items and also at the start and end of the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.spacedBy",
                    "Adds a fixed spacing between each item in the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.LightGray),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.Top",
                    "Aligns all items at the top vertically within the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .background(Color.LightGray),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("Top")
                        Text("Top")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.CenterVertically",
                    "Centers all items vertically within the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .background(Color.LightGray),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("Center")
                        Text("Center")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.Bottom",
                    "Aligns all items to the bottom vertically inside the Row."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .background(Color.LightGray),
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text("Bottom")
                        Text("Bottom")
                    }
                }
            }

            item {
                DemoCard(
                    "RowScope weight()",
                    "Divides available horizontal space proportionally between children."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                    ) {

                        Text(
                            "weight(1f)",
                            modifier = Modifier
                                .weight(1f)
                                .background(Color.Cyan)
                                .padding(8.dp)
                        )

                        Text(
                            "weight(2f)",
                            modifier = Modifier
                                .weight(2f)
                                .background(Color.Yellow)
                                .padding(8.dp)
                        )
                    }
                }
            }

            item {
                DemoCard(
                    "RowScope align()",
                    "Allows an individual child to override the Row's vertical alignment."
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .background(Color.LightGray),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            "Top",
                            modifier = Modifier.align(Alignment.Top)
                        )

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(
                            "Bottom",
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                    }
                }
            }
        }
    }
}