package com.example.jetpackcomposelearning.ui_components

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.jetpackcomposelearning.R
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40

@Composable
fun ImageDemoScreen(onBackClick: () -> Unit) {
    val context = LocalContext.current

    DisplayScreen(
        title = "Image Components",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            DemoImageCard(
                title = "Image with Resource",
                description = "Displays images stored in the app's drawable resources."
            ) {
                Image(
                    painter = painterResource(id = R.drawable.frame_1),
                    contentDescription = "Resource Image",
                    modifier = Modifier.size(100.dp)
                )
            }

            DemoImageCard(
                title = "Image with Bitmap",
                description = "Displays images using a bitmap object."
            ) {
                val bitmap = BitmapFactory.decodeResource(
                    context.resources,
                    R.drawable.sample_image
                )
            }

            DemoImageCard(
                title = "Image with Vector",
                description = "Displays vector drawable images that scale without losing quality."
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Vector Image",
                    modifier = Modifier.size(100.dp)
                )
            }

            DemoImageCard(
                title = "Network Image",
                description = "Displays images loaded from the internet."
            ) {
                AsyncImage(
                    model = "https://picsum.photos/200",
                    contentDescription = "Network Image",
                    modifier = Modifier.size(100.dp)
                )
            }
        }
    }
}

@Composable
fun DemoImageCard(
    title: String,
    description: String,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
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