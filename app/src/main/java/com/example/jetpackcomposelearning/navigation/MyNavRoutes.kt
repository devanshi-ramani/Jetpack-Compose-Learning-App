package com.example.jetpackcomposelearning.navigation

import kotlinx.serialization.Serializable

//sealed class creates restricted hierarchy
//so its subclasses can only be defined in the same file
//each subclass of sealed class can have its own data and behaviour

@Serializable
sealed class MyNavRoutes {

    @Serializable
    object EntryScreen: MyNavRoutes()

    @Serializable
    object ComposeFundamentals: MyNavRoutes()

    @Serializable
    object LayoutSystem: MyNavRoutes()

    @Serializable
    object UIComponents: MyNavRoutes()

    @Serializable
    object Text: MyNavRoutes()

    @Serializable
    object Badge : MyNavRoutes()

    @Serializable
    object Button : MyNavRoutes()

    @Serializable
    object BottomSheet : MyNavRoutes()

    @Serializable
    object Card : MyNavRoutes()

    @Serializable
    object Checkbox : MyNavRoutes()

    @Serializable
    object Divider : MyNavRoutes()

    @Serializable
    object Dialog : MyNavRoutes()

    @Serializable
    object Image : MyNavRoutes()

    @Serializable
    object Menu : MyNavRoutes()

    @Serializable
    object RadioButton : MyNavRoutes()

    @Serializable
    object Slider : MyNavRoutes()

    @Serializable
    object Spacer : MyNavRoutes()

    @Serializable
    object Lists : MyNavRoutes()

}