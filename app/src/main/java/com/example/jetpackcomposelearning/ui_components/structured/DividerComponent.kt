//package com.example.jetpackcomposelearning.ui_components.structured
//
//import androidx.compose.runtime.Composable
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.HorizontalDivider
//import androidx.compose.material3.VerticalDivider
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import com.example.jetpackcomposelearning.ui_components.DemoCard
//
//@Composable
//fun DividerComponent(onBackClick:() -> Unit){
//    StructureScreen(
//        title = "Divider Component",
//        onBackClick = onBackClick
//    ){
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            verticalArrangement = Arrangement.spacedBy(20.dp),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//
//            DemoCard(
//                title = "Horizontal Divider",
//                description = "Used to separate sections of content vertically. Used properties like color, thickness, paddging ."
//            ) {
//
//                Column {
//                    Text(
//                        "Profile",
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                    HorizontalDivider(
//                        color = Color.Gray,
//                        thickness = 5.dp,
//                        modifier = Modifier.padding(all = 12.dp)
//                    )
//                    Text(
//                        "Account Settings",
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                }
//            }
//
//            DemoCard(
//                title = "Vertical Divider",
//                description = "Used to separate horizontally arranged elements such as buttons, menu items, or navigation options."
//            ) {
//
//                Row(
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//
//                    Text("Login")
//
//                    VerticalDivider(
//                        modifier = Modifier.padding(horizontal = 12.dp),
//                        thickness = 3.dp,
//                        color = Color.Gray
//                    )
//
//                    Text("Register")
//                }
//            }
//        }
//    }
//}
//
