package com.example.jetpackcomposelearning.lists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NestedList(onBackClick:() ->Unit){
    Screen (
        title = " Nested Lists ",
        onBackClick = onBackClick
    ){
        LazyColumn(
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(10){ rowIndex ->
                Text(
                    text = "Row $rowIndex",
                    fontSize = 20.sp
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(15){ index ->
                        Box(
                            modifier = Modifier.size(100.dp)
                                .background(
                                    color = Color.LightGray,
                                    shape = RoundedCornerShape(15.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Item $index")
                        }

                    }

                }
            }
        }

    }
}