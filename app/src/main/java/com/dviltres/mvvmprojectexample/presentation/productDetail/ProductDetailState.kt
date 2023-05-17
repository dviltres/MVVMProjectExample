package com.dviltres.mvvmprojectexample.presentation.productDetail

import com.dviltres.mvvmprojectexample.domain.model.Product

data class ProductDetailState(
    val isLoading:Boolean = false,
    val product:Product? = null,
    val isFavorite:Boolean = false
)
