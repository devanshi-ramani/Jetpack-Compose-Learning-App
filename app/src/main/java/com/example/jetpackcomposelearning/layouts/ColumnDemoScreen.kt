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
import com.example.jetpackcomposelearning.ui_components.display.DemoCard

@Composable
fun ColumnDemoScreen(onBackClick: () -> Unit) {

    DemoScreen(
        title = "Column Demo",
        onBackClick = onBackClick
    ) {

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            item {
                DemoCard(
                    "Arrangement.Top",
                    "Places all items at the top of the Column."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(100.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.Bottom",
                    "Places all items at the bottom of the Column."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(100.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.Center",
                    "Places items in the vertical center of the Column."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(100.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.SpaceBetween",
                    "Distributes items so the first item is at the top and the last item is at the bottom with equal space between them."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(120.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Top")
                        Text("Middle")
                        Text("Bottom")
                    }
                }
            }

            item {
                DemoCard(
                    "Arrangement.SpaceAround",
                    "Adds equal space around each item vertically inside the Column."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(120.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.SpaceAround
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
                    "Places equal vertical spacing between items and also at the top and bottom."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(120.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.SpaceEvenly
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
                    "Adds a fixed vertical spacing between each item."
                ) {
                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.LightGray),
                        verticalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Text("A")
                        Text("B")
                        Text("C")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.Start",
                    "Aligns all items to the start (left side) horizontally."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray),
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text("Start")
                        Text("Start")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.CenterHorizontally",
                    "Places all items at the horizontal center of the Column."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Center")
                        Text("Center")
                    }
                }
            }

            item {
                DemoCard(
                    "Alignment.End",
                    "Aligns all items to the end (right side) horizontally."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray),
                        horizontalAlignment = Alignment.End
                    ) {
                        Text("End")
                        Text("End")
                    }
                }
            }

            item {
                DemoCard(
                    "ColumnScope weight()",
                    "Distributes vertical space among children proportionally."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .height(150.dp)
                            .background(Color.LightGray)
                    ) {

                        Text(
                            "weight(2f)",
                            modifier = Modifier
                                .weight(2f)
                                .background(Color.Cyan)
                                .padding(8.dp)
                        )

                        Text(
                            "weight(1f)",
                            modifier = Modifier
                                .weight(1f)
                                .background(Color.Yellow)
                                .padding(8.dp)
                        )
                    }
                }
            }

            item {
                DemoCard(
                    "ColumnScope align()",
                    "Allows a child to override the Column's horizontal alignment."
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray)
                    ) {

                        Text(
                            "Start",
                            modifier = Modifier.align(Alignment.Start)
                        )

                        Text(
                            "Center",
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )

                        Text(
                            "End",
                            modifier = Modifier.align(Alignment.End)
                        )
                    }
                }
            }
        }
    }
}