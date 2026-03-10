package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LayoutPropertiesDemoScreen(onBackClick: () -> Unit) {

    DemoScreen(
        title = "Layout Properties Demo",
        onBackClick = onBackClick
    ) {

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(".weight Property Example ", fontSize = 18.sp, textAlign = TextAlign.Center ,modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            ){
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("1f", color = Color.White)
                }
                Box(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("2f")
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("The second box takes more space because its weight is 2f.", fontSize = 16.sp,textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(24.dp))


            Text(".fillMaxWidth Property Example ", fontSize = 18.sp, textAlign = TextAlign.Center ,modifier = Modifier.fillMaxWidth())
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(Color.Gray ),
                contentAlignment = Alignment.Center
            ) {
                Text("Takes full width",color = Color.White )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Makes the layout take the full available width of its parent.", fontSize = 16.sp,textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(24.dp))


            Text(".fillMaxHeight Property Example ", fontSize = 18.sp, textAlign = TextAlign.Center ,modifier = Modifier.fillMaxWidth())
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .fillMaxHeight()
                        .background(Color.LightGray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Takes Full Height")
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Makes the layout take the full available height of its parent.", fontSize = 16.sp,textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(24.dp))


            Text(".fillMaxSize Property Example ", fontSize = 18.sp, textAlign = TextAlign.Center ,modifier = Modifier.fillMaxWidth())
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) {
                    Text("Fill Max Size", color = Color.White)
                }

            }
            Spacer(modifier = Modifier.height(12.dp))
            Text("Makes the layout take both the full width and full height of its parent container.", fontSize = 16.sp,textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}