package com.example.jetpackcomposelearning.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposelearning.fundamentals.ComposeFundamentals
import com.example.jetpackcomposelearning.homescreen.EntryScreen
import com.example.jetpackcomposelearning.layouts.LayoutSystemScreen
import com.example.jetpackcomposelearning.lists.ListsComponent
import com.example.jetpackcomposelearning.ui_components.Ui_Components
import com.example.jetpackcomposelearning.ui_components.badge.BadgeExample
import com.example.jetpackcomposelearning.ui_components.bottomSheet.BottomSheetComponent
import com.example.jetpackcomposelearning.ui_components.button.ButtonSystem
import com.example.jetpackcomposelearning.ui_components.card.CardComponent
import com.example.jetpackcomposelearning.ui_components.checkbox.CheckboxComponent
import com.example.jetpackcomposelearning.ui_components.dialog.DialogComponent
import com.example.jetpackcomposelearning.ui_components.divider.DividerComponent
import com.example.jetpackcomposelearning.ui_components.image.ImageDemoScreen
import com.example.jetpackcomposelearning.ui_components.menus.MenuComponent
import com.example.jetpackcomposelearning.ui_components.radiobutton.RadioButtonComponent
import com.example.jetpackcomposelearning.ui_components.slider.SliderComponent
import com.example.jetpackcomposelearning.ui_components.spacer.SpacerComponent
import com.example.jetpackcomposelearning.ui_components.text.TextDemoScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.EntryScreen
    ) {

        composable<MyNavRoutes.EntryScreen> {
            EntryScreen(navController)
        }
        composable<MyNavRoutes.ComposeFundamentals> {
            ComposeFundamentals(navController)
        }
        composable<MyNavRoutes.LayoutSystem> {
            LayoutSystemScreen(navController)
        }
        composable<MyNavRoutes.UIComponents> {
            Ui_Components(navController)
        }
        composable<MyNavRoutes.Text> {
            TextDemoScreen(navController)
        }
        composable<MyNavRoutes.Badge> {
            BadgeExample(navController)
        }

        composable<MyNavRoutes.Button> {
            ButtonSystem(navController)
        }

        composable<MyNavRoutes.BottomSheet> {
            BottomSheetComponent(navController)
        }

        composable<MyNavRoutes.Card> {
            CardComponent(navController)
        }

        composable<MyNavRoutes.Checkbox> {
            CheckboxComponent(navController)
        }

        composable<MyNavRoutes.Divider> {
            DividerComponent(navController)
        }

        composable<MyNavRoutes.Dialog> {
            DialogComponent(navController)
        }

        composable<MyNavRoutes.Image> {
            ImageDemoScreen(navController)
        }

        composable<MyNavRoutes.Menu> {
            MenuComponent(navController)
        }

        composable<MyNavRoutes.RadioButton> {
            RadioButtonComponent(navController)
        }

        composable<MyNavRoutes.Slider> {
            SliderComponent(navController)
        }

        composable<MyNavRoutes.Spacer> {
            SpacerComponent(navController)
        }
        composable<MyNavRoutes.Lists> {
            ListsComponent(navController)
        }
    }
}