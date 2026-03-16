package com.example.jetpackcomposelearning.ui_components.image

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.jetpackcomposelearning.R
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun ImageDemoScreen(navController: NavController) {
    val context = LocalContext.current;
    val padding = 15.dp;
    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        Button(
            onClick = {
                navController.navigate(MyNavRoutes.UIComponents)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Pink80),
        ) {
            Text("Back")
        }
        Text(
            text = " Image Examples ",
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding),
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40,
            textAlign = TextAlign.Center
        )
        DemoCard(
            title = "Image with Resource",
            description = "Displays images stored in the app's drawable resources."
        ) {
            Image(
                painter = painterResource(id = R.drawable.resource_frame),
                contentDescription = "Resource Image",
                modifier = Modifier.size(80.dp)
            )
        }

        DemoCard(
            title = "Image with Bitmap",
            description = "Displays images using a bitmap object."
        ) {
            val bitmap = BitmapFactory.decodeResource(
                context.resources,
                R.drawable.bitmap_image
            )
            Image(
                bitmap = bitmap.asImageBitmap(),
                contentDescription = "Bitmap Image",
                modifier = Modifier.size(70.dp),
                contentScale = ContentScale.Crop
            )
        }

        DemoCard(
            title = "Image with Vector",
            description = "Displays vector drawable images that scale without losing quality."
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Vector Image",
                modifier = Modifier.size(70.dp)
            )
        }

        DemoCard(
            title = "Network Image",
            description = "Displays images loaded from the internet."
        ) {
            AsyncImage(
                model = "https://picsum.photos/200",
                contentDescription = "Network Image",
                modifier = Modifier.size(80.dp)
            )
        }
    }
}
