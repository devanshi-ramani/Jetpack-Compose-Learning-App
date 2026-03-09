package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AlignmentArrangementDemoScreen(onBackClick: () -> Unit) {
    DemoScreen(
        title = "Alignment & Arrangement",
        onBackClick = onBackClick
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 15.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            item {
                Text("Note: Arrangement and Alignment are properties of layouts, not layouts themselves. They are used inside layout composables like Row, Column, and Box to control how child elements are placed. ")
                Spacer(modifier = Modifier.height(10.dp))
                Text("Column: verticalArrangement")
            }

            item {
                DemoCardBox {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        DemoItem("Top")
                        DemoItem("Middle")
                        DemoItem("Bottom")
                    }
                }
            }

            item {
                Text("Here the items move vertically because Column places children top to bottom.")
            }

            item {
                Text("Column: horizontalAlignment")
            }

            item {
                DemoCardBox {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        DemoItem("One")
                        Spacer(modifier = Modifier.height(8.dp))
                        DemoItem("Two")
                        Spacer(modifier = Modifier.height(8.dp))
                        DemoItem("Three")
                    }
                }
            }

            item {
                Text("Here the items stay at the top, but move horizontally because alignment works on the cross axis.")
            }

            item {
                Text("Row: horizontalArrangement")
            }

            item {
                DemoCardBox {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                    ) {
                        DemoItem("Left")
                        DemoItem("Center")
                        DemoItem("Right")
                    }
                }
            }

            item {
                Text("Here the items move horizontally because Row places children left to right.")
            }

            item {
                Text("Row: verticalAlignment")
            }

            item {
                DemoCardBox {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        DemoItem("One")
                        DemoItem("Two")
                        DemoItem("Three")
                    }
                }
            }

            item {
                Text("Here the items stay on the left, but move vertically because alignment works on the Vertical.")
            }
        }
    }
}

@Composable
fun DemoCardBox(content: @Composable () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        content()
    }
}

@Composable
fun DemoItem(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .background(Color.LightGray, RoundedCornerShape(8.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp)
    )
}