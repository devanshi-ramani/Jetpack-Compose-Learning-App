package com.example.jetpackcomposelearning.ui_components.structured

import androidx.compose.runtime.Composable

@Composable
fun SurfaceComponent (onBackClick:() -> Unit) {
    StructureScreen(
        title = "Surface Component",
        onBackClick = onBackClick
    ){

    }
}