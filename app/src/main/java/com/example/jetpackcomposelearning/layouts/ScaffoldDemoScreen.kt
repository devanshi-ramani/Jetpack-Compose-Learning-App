package com.example.jetpackcomposelearning.layouts

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp

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
                        title = { Text("TopAppBar", color = Color.White, fontSize = 17.sp) },
                        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.DarkGray)
                    )
                },

                bottomBar = {
                    BottomAppBar(
                        modifier = Modifier.fillMaxWidth(),
                        containerColor = Color.DarkGray,
                        contentColor = Color.White
                    ) {
                        Text("BottomAppBar", color = Color.White, fontSize = 18.sp)
                    }
                },

                floatingActionButton = {
                    FloatingActionButton(
                        onClick = {},
                        containerColor = Color.DarkGray
                    ) {
                        Text("FAB", color = Color.White, fontSize = 18.sp)
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
                    Text("Main Content", color = Color.Black, fontSize = 18.sp)
                }

            }
        }
    }
}