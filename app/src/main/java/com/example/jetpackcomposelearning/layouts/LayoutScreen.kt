package com.example.jetpackcomposelearning.layouts

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

enum class LayoutScreenType {
    MENU,
    COLUMN,
    ROW,
    BOX,
    SCAFFOLD,
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
            onScaffoldClick = {currentScreen = LayoutScreenType.SCAFFOLD},
            onAlignmentClick = { currentScreen = LayoutScreenType.ALIGNMENT},
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
        LayoutScreenType.SCAFFOLD -> ScaffoldDemoScreen(
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
    onScaffoldClick: () -> Unit,
    onAlignmentClick: () -> Unit,
    onWeightClick: () -> Unit

) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = " Layout Screen ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40
        )

        Spacer(modifier = Modifier.height(12.dp))

        LayoutMenuButton(
            text = "Column",
            onClick = onColumnClick
        )

        LayoutMenuButton(
            text = "Row",
            onClick = onRowClick
        )

        LayoutMenuButton(
            text = "Box",
            onClick = onBoxClick
        )

        LayoutMenuButton(
            text = "Scaffold",
            onClick = onScaffoldClick
        )

        LayoutMenuButton(
            text = "Alignment & Arrangement",
            onClick = onAlignmentClick
        )

        LayoutMenuButton(
            text = "Weight Example",
            onClick = onWeightClick
        )
    }
}

@Composable
fun LayoutMenuButton(
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
        Text(text = text,modifier = Modifier.fillMaxWidth(), fontSize = 18.sp, textAlign = TextAlign.Center)
    }
}

@Composable
fun DemoScreen(
    title: String,
    onBackClick: () -> Unit,
    content: @Composable () -> Unit
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







