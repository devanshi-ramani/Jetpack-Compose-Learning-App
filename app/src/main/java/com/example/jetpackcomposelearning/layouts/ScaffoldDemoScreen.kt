package com.example.jetpackcomposelearning.layouts

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldDemoScreen(onBackClick: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DemoScreen(
            title = "Scaffold Demo",
            onBackClick = onBackClick
        ) {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("TopAppBar") }
                    )
                },

                bottomBar = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .background(Color.DarkGray),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("BottomBar", color = Color.White)
                    }
                },

                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {},
                        containerColor = Color.Black
                    ) {
                        Text("FAB")
                    }
                }

            ) { paddingValues ->

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Main Content")
                }

            }
        }
    }
}