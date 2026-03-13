//package com.example.jetpackcomposelearning.ui_components.feedback
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.heightIn
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.jetpackcomposelearning.ui.theme.Pink80
//import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
//
//enum class ComponentType {
//    MENU,
//    SNACKBAR,
//    PROGRESSINDICATOR,
//    BADGE
//}
//
//
//@Composable
//fun FeedbackComponent() {
//    var currentScreen by remember { mutableStateOf(ComponentType.MENU) }
//
//    when (currentScreen) {
//        ComponentType.MENU -> ComponentMenu(
//            onSnackBarClick = { currentScreen = ComponentType.SNACKBAR},
//            onIndicatorClick = { currentScreen = ComponentType.PROGRESSINDICATOR},
//            onBadgeClick = { currentScreen = ComponentType.BADGE}
//        )
//
//        ComponentType.SNACKBAR  -> SnackBar (
//            onBackClick = { currentScreen = ComponentType.MENU }
//        )
//
//        ComponentType.PROGRESSINDICATOR -> DialogComponent(
//            onBackClick = { currentScreen = ComponentType.MENU }
//        )
//
//        ComponentType.BADGE -> ModalBottomSheetComponent(
//            onBackClick = { currentScreen = ComponentType.MENU }
//        )
//    }
//}
//
//@Composable
//fun ComponentMenu(
//    onSnackBarClick: () -> Unit,
//    onIndicatorClick: () -> Unit,
//    onBadgeClick: () -> Unit
//) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = "Feedback Components",
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 28.sp,
//            fontWeight = FontWeight.Bold,
//            color = PurpleGrey40
//        )
//
//        Spacer(modifier = Modifier.height(6.dp))
//
//        Text(
//            text = "Used to show progress, status, or feedback to the user.",
//            modifier = Modifier.padding(horizontal = 20.dp),
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 18.sp,
//            color = PurpleGrey40
//        )
//
//        Spacer(modifier = Modifier.height(12.dp))
//
//        ComponentMenuButton(
//            text = "AlertDialog Component",
//            onClick = onSnackBarClick
//        )
//
//        ComponentMenuButton(
//            text = "Dialog Component",
//            onClick = onIndicatorClick
//        )
//        ComponentMenuButton(
//            text = "DropMenu Components",
//            onClick = onBadgeClick
//        )
//    }
//}
//
//@Composable
//fun ComponentMenuButton(
//    text: String,
//    onClick: () -> Unit
//) {
//    Button(
//        onClick = onClick,
//        modifier = Modifier
//            .fillMaxWidth(0.9f)
//            .heightIn(min = 100.dp)
//            .padding(vertical = 8.dp),
//        shape = RoundedCornerShape(20.dp),
//        elevation = ButtonDefaults.buttonElevation(8.dp),
//        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
//    ) {
//        Text(
//            text = text,
//            modifier = Modifier.fillMaxWidth(),
//            fontSize = 18.sp,
//            textAlign = TextAlign.Center
//        )
//    }
//}
//
//@Composable
//fun OverlayScreen(
//    title: String,
//    onBackClick: () -> Unit,
//    content: @Composable () -> Unit
//) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(horizontal = 16.dp, vertical = 24.dp)
//    ) {
//        Button(
//            onClick = onBackClick,
//            colors = ButtonDefaults.buttonColors(containerColor = Pink80)
//        ) {
//            Text("Back")
//        }
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        Text(
//            text = title,
//            modifier = Modifier.fillMaxWidth(),
//            fontFamily = FontFamily.SansSerif,
//            fontSize = 28.sp,
//            fontWeight = FontWeight.Bold,
//            color = PurpleGrey40,
//            textAlign = TextAlign.Center
//        )
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            content()
//        }
//    }
//}