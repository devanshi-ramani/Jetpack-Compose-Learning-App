package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.jetpackcomposelearning.ui_components.badge.BadgeExample
import com.example.jetpackcomposelearning.ui_components.button.ButtonSystem

//import com.example.jetpackcomposelearning.ui_components.input.InputSystem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            ButtonSystem()
        }
    }
}