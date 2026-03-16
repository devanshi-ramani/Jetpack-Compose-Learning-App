package com.example.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposelearning.navigation.NavGraph
import com.example.jetpackcomposelearning.ui_components.bottomSheet.BottomSheetComponent

import com.example.jetpackcomposelearning.ui_components.button.ButtonSystem
import com.example.jetpackcomposelearning.ui_components.card.CardComponent
import com.example.jetpackcomposelearning.ui_components.checkbox.CheckboxComponent
import com.example.jetpackcomposelearning.ui_components.dialog.DialogComponent
import com.example.jetpackcomposelearning.ui_components.divider.DividerComponent
import com.example.jetpackcomposelearning.ui_components.image.ImageDemoScreen
import com.example.jetpackcomposelearning.ui_components.menus.MenuComponent
import com.example.jetpackcomposelearning.ui_components.radiobutton.RadioButtonComponent
import com.example.jetpackcomposelearning.ui_components.slider.SliderComponent
//import com.example.jetpackcomposelearning.ui_components.searchbar.SimpleSearchBar
//import com.example.jetpackcomposelearning.ui_components.searchbar.SimpleSearchBarExample
import com.example.jetpackcomposelearning.ui_components.spacer.SpacerComponent
import com.example.jetpackcomposelearning.ui_components.text.TextDemoScreen

//import com.example.jetpackcomposelearning.ui_components.input.InputSystem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
//            ButtonSystem()
//            CardComponent()
//            CheckboxComponent()
//            DividerComponent()
//            MenuComponent()
//            SpacerComponent()
//            TextDemoScreen()
//            BottomSheetComponent()
            NavGraph()

        }
    }
}