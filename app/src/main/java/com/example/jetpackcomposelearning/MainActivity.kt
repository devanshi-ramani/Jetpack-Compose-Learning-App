package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.jetpackcomposelearning.ui_components.button.ButtonSystem
import com.example.jetpackcomposelearning.ui_components.card.CardComponent
import com.example.jetpackcomposelearning.ui_components.checkbox.CheckboxComponent

//import com.example.jetpackcomposelearning.ui_components.input.InputSystem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
//            ButtonSystem()
//            CardComponent()
            CheckboxComponent()
        }
    }
}