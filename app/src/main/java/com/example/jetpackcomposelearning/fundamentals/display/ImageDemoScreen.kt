package com.example.jetpackcomposelearning.fundamentals.display

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.jetpackcomposelearning.R

@Composable
fun ImageDemoScreen(onBackClick: () -> Unit) {
    val context = LocalContext.current

    DisplayScreen(
        title = "Image Components",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            DemoCard(
                title = "Image with Resource",
                description = "Displays images stored in the app's drawable resources."
            ) {
                Image(
                    painter = painterResource(id = R.drawable.resource_frame),
                    contentDescription = "Resource Image",
                    modifier = Modifier.size(70.dp)
                )
            }

            DemoCard(
                title = "Image with Bitmap",
                description = "Bitmap images are loaded into memory and displayed using a Bitmap object."
            ) {
                val bitmap = BitmapFactory.decodeResource(
                   context.resources,
                    R.drawable.bitmap_image
                )
                Image(
                    bitmap = bitmap.asImageBitmap(),
                    contentDescription = "Bitmap Image",
                    modifier = Modifier.size(60.dp),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Fit
                )
            }

            DemoCard(
                title = "Image with Vector",
                description = "Displays vector drawable images that scale without losing quality."
            ) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Vector Image",
                    modifier = Modifier.size(50.dp)
                )
            }

            DemoCard(
                title = "Network Image",
                description = "Displays images loaded from the internet using a URL."
            ) {
                AsyncImage(
                    model = "https://picsum.photos/id/237/200",
                    contentDescription = "Network Image",
                    modifier = Modifier.size(70.dp)
                )
            }
        }
    }
}