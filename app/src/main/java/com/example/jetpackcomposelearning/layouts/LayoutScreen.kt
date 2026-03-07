package com.example.jetpackcomposelearning.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class LayoutScreenType {
    MENU,
    COLUMN,
    ROW,
    BOX,
    ALIGNMENT,
    WEIGHT
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LayoutSystemScreen() {
    var currentScreen by remember { mutableStateOf(LayoutScreenType.MENU) }

    when (currentScreen) {
        LayoutScreenType.MENU -> LayoutMenu(
            onColumnClick = { currentScreen = LayoutScreenType.COLUMN },
            onRowClick = { currentScreen = LayoutScreenType.ROW },
            onBoxClick = { currentScreen = LayoutScreenType.BOX },
            onAlignmentClick = { currentScreen = LayoutScreenType.ALIGNMENT },
            onWeightClick = { currentScreen = LayoutScreenType.WEIGHT }
        )

        LayoutScreenType.COLUMN -> ColumnDemoScreen(
            onBackClick = { currentScreen = LayoutScreenType.MENU }
        )

        LayoutScreenType.ROW -> RowDemoScreen(
            onBackClick = { currentScreen = LayoutScreenType.MENU }
        )

        LayoutScreenType.BOX -> BoxDemoScreen(
            onBackClick = { currentScreen = LayoutScreenType.MENU }
        )

        LayoutScreenType.ALIGNMENT -> AlignmentArrangementDemoScreen(
            onBackClick = { currentScreen = LayoutScreenType.MENU }
        )

        LayoutScreenType.WEIGHT -> WeightDemoScreen(
            onBackClick = { currentScreen = LayoutScreenType.MENU }
        )
    }
}

@Composable
fun LayoutMenu(
    onColumnClick: () -> Unit,
    onRowClick: () -> Unit,
    onBoxClick: () -> Unit,
    onAlignmentClick: () -> Unit,
    onWeightClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Layout System",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onColumnClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Button 1 → Column")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onRowClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Button 2 → Row")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onBoxClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Button 3 → Box")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onAlignmentClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Button 4 → Alignment & Arrangement")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onWeightClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Button 5 → Weight Example")
        }
    }
}

@Composable
fun DemoScreen(
    title: String,
    onBackClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Button(onClick = onBackClick) {
            Text("Back")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = title,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        content()
    }
}






