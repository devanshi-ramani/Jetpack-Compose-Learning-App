package com.example.jetpackcomposelearning.ui_components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40

enum class ComponentType {
    MENU,
    TEXT,
    IMAGE,
    ICON
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DisplaySystem() {
    var currentScreen by remember { mutableStateOf(ComponentType.MENU) }

    when (currentScreen) {
        ComponentType.MENU -> ComponentMenu(
            onTextClick = { currentScreen = ComponentType.TEXT },
            onImageClick = { currentScreen = ComponentType.IMAGE },
            onIconClick = { currentScreen = ComponentType.ICON }
        )

        ComponentType.TEXT -> TextDemoScreen(
            onBackClick = { currentScreen = ComponentType.MENU },
        )

        ComponentType.IMAGE -> ImageDemoScreen(
            onBackClick = { currentScreen = ComponentType.MENU },
        )

        ComponentType.ICON -> IconDemoScreen(
            onBackClick = { currentScreen = ComponentType.MENU }
        )

    }
}

@Composable
fun ComponentMenu(
    onTextClick: () -> Unit,
    onImageClick: () -> Unit,
    onIconClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = " Display Components ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = " Used to display information to the user. ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            color = PurpleGrey40
        )
        Spacer(modifier = Modifier.height(12.dp))

        ComponentMenuButton(
            text = "Text",
            onClick = onTextClick
        )
        ComponentMenuButton(
            text = "Image",
            onClick = onImageClick
        )
        ComponentMenuButton(
            text = "Icon",
            onClick = onIconClick
        )
    }
}

@Composable
fun ComponentMenuButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .heightIn(min = 100.dp)
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
    ) {
        Text(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun DisplayScreen(
    title: String,
    onBackClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = onBackClick,
                modifier = Modifier.padding(start = 17.dp, top = 32.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Pink80)
            ) {
                Text("Back")
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                Text(
                    text = title,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = PurpleGrey40
                )
                Spacer(modifier = Modifier.height(30.dp))
                content()
            }
        }
    }
}








