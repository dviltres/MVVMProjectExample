package com.dviltres.mvvmprojectexample.domain.model

data class Product(
    val productCode:String,
    val name: String,
    val imageUrl: String?,
    val caloriesPer100g: Int,
    val carbsPer100g: Int,
    val proteinPer100g: Int,
    val fatPer100g: Int,
    var isFavorite:Boolean = false
)
