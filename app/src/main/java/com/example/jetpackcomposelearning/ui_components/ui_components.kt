package com.example.jetpackcomposelearning.ui_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.*

@Composable
fun Ui_Components(navController: NavController) {
    val componentList = listOf(
        "Text" to MyNavRoutes.Text,
        "Badge" to MyNavRoutes.Badge,
        "Button" to MyNavRoutes.Button,
        "BottomSheet" to MyNavRoutes.BottomSheet,
        "Card" to MyNavRoutes.Card,
        "Checkbox" to MyNavRoutes.Checkbox,
        "Divider" to MyNavRoutes.Divider,
        "Dialog" to MyNavRoutes.Dialog,
        "Image" to MyNavRoutes.Image,
        "Menus" to MyNavRoutes.Menu,
        "Radio Button" to MyNavRoutes.RadioButton,
        "Slider" to MyNavRoutes.Slider,
        "Spacer" to MyNavRoutes.Spacer
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Button(
            onClick = { navController.navigate(MyNavRoutes.EntryScreen) },
            modifier = Modifier.padding(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Pink80)
        ) {
            Text("Back")
        }
        Text(
            text = "UI Components",
            modifier = Modifier.fillMaxWidth(),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )

        LazyColumn(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(componentList) { component ->

                ComponentButton(
                    title = component.first,
                    onClick = {
                        navController.navigate(component.second)
                    }
                )
            }
        }
    }
}

@Composable
fun ComponentButton(
    title: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .heightIn(min = 100.dp)
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = title,
                modifier = Modifier.weight(1f),
                fontSize = 18.sp
            )

            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null
            )
        }
    }
}