package com.dviltres.mvvmprojectexample.data.mapper

import com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity
import com.dviltres.mvvmprojectexample.data.remote.dto.ProductDto
import com.dviltres.mvvmprojectexample.domain.model.Product
import kotlin.math.roundToInt

fun ProductDto.toProduct(): Product? {
    val carbsPer100g = nutriments.carbohydrates100g.roundToInt()
    val proteinPer100g = nutriments.proteins100g.roundToInt()
    val fatPer100g = nutriments.proteins100g.roundToInt()
    val caloriesPer100g = nutriments.energyKcal100g.roundToInt()
    return Product(
        productCode = productCode ?:return null,
        name = productName,
        carbsPer100g = carbsPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        imageUrl = imageFrontUrl,
    )
}

fun Product.toProductEntity(): ProductEntity {
    return ProductEntity(
        productCode = productCode,
        name = name,
        carbsPer100g = carbsPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        imageUrl = imageUrl,
        isFavorite = isFavorite
    )
}

fun ProductEntity.toProduct(): Product {
    return Product (
        productCode = productCode,
        name = name,
        carbsPer100g = carbsPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        caloriesPer100g = caloriesPer100g,
        imageUrl = imageUrl,
        isFavorite = isFavorite
    )
}
