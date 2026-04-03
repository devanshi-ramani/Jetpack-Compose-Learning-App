package com.example.jetpackcomposelearning.homescreen

import androidx.compose.foundation.layout.Arrangement
import com.example.jetpackcomposelearning.ui.theme.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.filled.ChevronRight
import androidx.navigation.NavHostController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes


@Composable
fun EntryScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = " HOMESCREEN ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40
        )

        Spacer(modifier = Modifier.height(20.dp))

        MenuButton(title = "Compose Fundamentals", onClick = {navController.navigate(MyNavRoutes.ComposeFundamentals)})
        MenuButton(title = "Layout System", onClick = {navController.navigate(MyNavRoutes.LayoutSystem)})
        MenuButton(title = "UI components", onClick = {navController.navigate(MyNavRoutes.UIComponents)})
        MenuButton(title = "Lists", onClick = {navController.navigate(MyNavRoutes.Lists)})

    }
}

@Composable
fun MenuButton(title : String, onClick : () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .heightIn(min = 100.dp)
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
    ){
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = title, modifier = Modifier.weight(1f), fontSize = 18.sp)
            Icon( imageVector = Icons.Default.ChevronRight, contentDescription = null)
        }
    }
}























