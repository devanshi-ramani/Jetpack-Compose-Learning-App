package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposelearning.fundamentals.ComposeFundamentals

import com.example.jetpackcomposelearning.homescreen.EntryScreen
import com.example.jetpackcomposelearning.layouts.LayoutSystemScreen
import com.example.jetpackcomposelearning.ui_components.DisplaySystem
import com.example.jetpackcomposelearning.ui_components.ImageDemoScreen
import com.example.jetpackcomposelearning.ui_components.TextDemoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
//            EntryScreen()
//            LayoutSystemScreen()
//            ComposeFundamentals()
            DisplaySystem()


        }
    }
}