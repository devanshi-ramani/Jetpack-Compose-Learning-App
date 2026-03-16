package com.example.jetpackcomposelearning.lists

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40


enum class ListType{
    MENU,
    LAZYCOLUMN,
    LAZYROW,
    NESTED
}

@Composable
fun ListsComponent(navController: NavController){
    var currentScreen by remember { mutableStateOf(ListType.MENU) }

    when(currentScreen) {
        ListType.MENU -> Menu(
            onColumnClick = {currentScreen = ListType.LAZYCOLUMN},
            onRowClick = {currentScreen = ListType.LAZYROW},
            onNestedClick = {currentScreen = ListType.NESTED},
            onBackClick = { navController.navigate(MyNavRoutes.EntryScreen)}
        )

        ListType.LAZYCOLUMN -> LazycolumnComponent(
            onBackClick = { currentScreen = ListType.MENU}
        )
        ListType.LAZYROW -> LazyrowComponent(
            onBackClick = { currentScreen = ListType.MENU}
        )
        ListType.NESTED ->NestedList(
            onBackClick = { currentScreen = ListType.MENU}
        )
    }
}

@Composable
fun Menu(
    onColumnClick: () -> Unit,
    onRowClick: () -> Unit,
    onNestedClick: () -> Unit,
    onBackClick: () ->Unit
){
    Button(
        onClick = {onBackClick()},
        modifier = Modifier.padding(start = 17.dp, top = 32.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
    ){
        Text(text = "text")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            text = " Lists Display ",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = PurpleGrey40
        )

        Spacer(modifier = Modifier.height(12.dp))

        MenuButton(
            text = "LazyColumn",
            onClick = onColumnClick
        )
        MenuButton(
            text = "LazyRow",
            onClick = onRowClick
        )
        MenuButton(
            text = "Nested List",
            onClick = onNestedClick
        )
    }
}

@Composable
fun MenuButton (
    text: String,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth(0.9f)
            .heightIn(min = 100.dp)
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = ButtonDefaults.buttonElevation(8.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Pink80)
    ){
        Text(text = text,modifier = Modifier.fillMaxWidth(), fontSize = 18.sp, textAlign = TextAlign.Center)
    }
}

@Composable
fun Screen (
    title: String,
    onBackClick: () -> Unit,
    content: @Composable () -> Unit
){
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
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = title,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = PurpleGrey40
                )
                Spacer(modifier = Modifier.height(10.dp))
                content()
            }
        }
    }

