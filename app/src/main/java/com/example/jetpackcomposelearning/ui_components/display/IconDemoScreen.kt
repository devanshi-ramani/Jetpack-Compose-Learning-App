package com.example.jetpackcomposelearning.ui_components.display

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.R
import com.example.jetpackcomposelearning.ui.theme.*

@Composable
fun IconDemoScreen(onBackClick: () -> Unit) {

    DisplayScreen(
        title = "Icon Components",
        onBackClick = onBackClick
    ) {

        Column(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            IconDemoCard(
                title = "Material Icon",
                description = "Displays standard icons from the Material Design icon library provided by Jetpack Compose."
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home Icon",
                    modifier = Modifier.size(40.dp),
                    tint = PurpleGrey40
                )
            }

            IconDemoCard(
                title = "Icon with ImageVector",
                description = "Displays vector-based icons using an ImageVector, which allows scalable icons without losing quality."
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Favorite Icon",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Red
                )
            }

            IconDemoCard(
                title = "Icon with painterResource",
                description = "Displays custom icons stored in drawable resources."
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.resource_frame),
                    contentDescription = "Custom Icon",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Unspecified
                )
            }
        }
    }
}

@Composable
fun IconDemoCard(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = title,
                fontSize = 18.sp,
                color = PurpleGrey40
            )

            Text(
                text = description,
                fontSize = 14.sp
            )

            content()
        }
    }
}