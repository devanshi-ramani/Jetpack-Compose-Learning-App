//package com.example.jetpackcomposelearning.ui_components.structured
//
//import androidx.compose.runtime.Composable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.layout.height
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun SpacerComponent (onBackClick:() -> Unit) {
//    StructureScreen(
//        title = "Spacer Component",
//        onBackClick = onBackClick
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            verticalArrangement = Arrangement.spacedBy(20.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            DemoCard(
//                title = "Vertical Spacer",
//                description = "Used to create vertical space between elements such as text fields or buttons in forms."
//            ) {
//
//                Column {
//                    Text("Username")
//
//                    Spacer(modifier = Modifier.height(16.dp))
//
//                    Text("Password")
//                }
//            }
//
//            DemoCard(
//                title = "Horizontal Spacer",
//                description = "Used to create space between items placed in a row such as icons or buttons."
//            ) {
//
//                Row {
//                    Text("Like")
//
//                    Spacer(modifier = Modifier.width(20.dp))
//
//                    Text("Share")
//                }
//            }
//
//            DemoCard(
//                title = "Spacer with Weight",
//                description = "Used to push elements apart. Commonly used in toolbars and layouts."
//            ) {
//
//                Row(
//                    modifier = Modifier.fillMaxWidth()
//                ) {
//                    Text("Left")
//                    Spacer(modifier = Modifier.weight(1f))
//                    Text("Middle")
//                    Spacer(modifier = Modifier.weight(2f))
//                    Text("Right")
//                }
//            }
//        }
//    }
//}