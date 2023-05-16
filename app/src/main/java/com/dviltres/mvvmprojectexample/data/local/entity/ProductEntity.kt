package com.dviltres.mvvmprojectexample.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dviltres.mvvmprojectexample.common.UtilConstants

@Entity(tableName = UtilConstants.PRODUCT_TABLE)
data class ProductEntity(
    @PrimaryKey(autoGenerate = false)
    val productCode:String,
    val name: String,
    val imageUrl: String?,
    val caloriesPer100g: Int,
    val carbsPer100g: Int,
    val proteinPer100g: Int,
    val fatPer100g: Int,
    val isFavorite:Boolean
)


