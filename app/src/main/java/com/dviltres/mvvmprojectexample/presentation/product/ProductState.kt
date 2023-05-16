package com.dviltres.mvvmprojectexample.presentation.product

import com.dviltres.mvvmprojectexample.domain.model.Product

data class ProductState(
    val isLoading:Boolean = false,
    val isHintVisible: Boolean = false,
    val products: List<Product> = emptyList(),
    val query:String = ""
)
