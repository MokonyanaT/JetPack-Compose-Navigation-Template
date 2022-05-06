package com.example.clydebyte

sealed class Screen(val route:String){
    object Page1 : Screen(route = "page_1")
    object Page2 : Screen(route = "page_2")
    object Page3 : Screen(route = "page_3")
    object Page4 : Screen(route = "page_4")
    object Page5 : Screen(route = "page_5")

}
