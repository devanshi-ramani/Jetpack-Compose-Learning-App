package com.example.jetpackcomposelearning.ui_components.dialog

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcomposelearning.navigation.MyNavRoutes
import com.example.jetpackcomposelearning.ui.theme.Pink80
import com.example.jetpackcomposelearning.ui.theme.PurpleGrey40
import com.example.jetpackcomposelearning.ui_components.DemoCard

@Composable
fun DialogComponent(navController: NavController) {
    val padding = 30.dp;
    Column(
        modifier = Modifier.padding(padding),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Button(
            onClick = {
                navController.navigate(MyNavRoutes.UIComponents)
            },
            colors = ButtonDefaults.buttonColors(containerColor = Pink80)
        ) {
            Text("Back")
        }
        Text(
            text = " Dialog Example ",
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
            title = "Alert Dialog Component ",
            description = " On clicking below button Alert dialog will be popped up"
        ) {
            val context = LocalContext.current;
            var openDialog by remember {mutableStateOf(false)}
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Delete item",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                    IconButton(
                        onClick = {openDialog = true },
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.DarkGray,
                            contentColor = Color.LightGray
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete Item"
                        )
                    }
                }
                if(openDialog){
                    AlertDialog(
                        onDismissRequest = { openDialog = false },
                        icon = {
                            Icon(imageVector = Icons.Default.Delete,
                                contentDescription = "Delete Icon"
                            )
                        },
                        title = {
                            Text(text = "Delete Item")
                        },
                        text = {Text(text = " Are you sure you want to delete this item? ")},
                        confirmButton = {
                            Button(onClick = {
                                Toast.makeText(
                                    context,
                                    "Item has been Deleted Successfully",
                                    Toast.LENGTH_SHORT
                                ).show()
                                openDialog = false
                            },
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.DarkGray,
                                    contentColor = Color.White
                                )){
                                Text(text = "Delete")
                            }
                        },
                        dismissButton = {
                            Button(onClick = {openDialog = false},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.LightGray,
                                    contentColor = Color.Gray
                                )
                            ){
                            Text(text = "Cancel")
                        }
                        },
                        containerColor = Color.White,
                        titleContentColor = Color.DarkGray,
                        textContentColor =  Color.DarkGray
                    )
                }
            }

        }
    }
}
