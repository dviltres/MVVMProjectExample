package com.dviltres.mvvmprojectexample.presentation.util

sealed class Screen(val route: String) {
    object ProductsScreen: Screen( "products_screen")
    object ProductDetailScreen: Screen( "product_detail_screen")
}