package com.example.jetpackcomposelearning.lists

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyrowComponent(onBackClick:() -> Unit){
    Screen(
        title = "LazyRow",
        onBackClick = onBackClick
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 30.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                item {
                    Text(text = "First item")
                }

                items(50) { index ->
                    Text(text = "Item : $index")
                }

                item {
                    Text(text = "Last item")
                }


            }
        }

    }
}