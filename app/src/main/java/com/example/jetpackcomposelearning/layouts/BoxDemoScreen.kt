package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun BoxDemoScreen(onBackClick: () -> Unit) {

    DemoScreen(
        title = "Box Demo",
        onBackClick = onBackClick
    ) {

        LazyColumn(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            item {
                DemoCard(
                    title = "Basic Box",
                    description = "Box places items on top of each other. Used for overlays like text over image."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .background(Color.LightGray)
                    ) {
                        Text("First Text")
                        Text("Second Text")
                    }
                }
            }

            item {
                DemoCard(
                    title = "contentAlignment = Alignment.Center",
                    description = "Used when all content inside the Box should be placed in the center."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .background(Color.LightGray),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Centered Text")
                    }
                }
            }

            item {
                DemoCard(
                    title = "Alignment.TopStart",
                    description = "Used when content should appear at the top-left area of the Box."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .background(Color.LightGray),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Text("Top Start")
                    }
                }
            }

            item {
                DemoCard(
                    title = "Alignment.BottomEnd",
                    description = "Used when content should appear at the bottom-right area, like badges or labels."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .background(Color.LightGray),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Text(
                            text = "Bottom End",
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }

            item {
                DemoCard(
                    title = "BoxScope align()",
                    description = "Used to place individual children at different positions inside the same Box."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .background(Color.LightGray)
                    ) {
                        Text(
                            text = "Top Start",
                            modifier = Modifier.align(Alignment.TopStart)
                        )

                        Text(
                            text = "Center",
                            modifier = Modifier.align(Alignment.Center)
                        )

                        Text(
                            text = "Bottom End",
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(8.dp)
                        )
                    }
                }
            }

            item {
                DemoCard(
                    title = "matchParentSize()",
                    description = "Used when a child should take the exact same size as the parent Box. Common for overlays."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .matchParentSize()
                                .background(Color.LightGray)
                        )

                        Text(
                            text = "Text over full-size background",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }

            item {
                DemoCard(
                    title = "padding() and background()",
                    description = "Used to add inner spacing and background styling to the Box."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .background(Color.Yellow)
                            .padding(46.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Padded Box")
                    }
                }
            }

            item {
                DemoCard(
                    title = "fillMaxSize() inside Box",
                    description = "Used when inner content should occupy the full available size of the Box."
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .background(Color.LightGray)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color(0x3300FF00))
                        )

                        Text(
                            text = "Full Size Child",
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        }
    }
}
