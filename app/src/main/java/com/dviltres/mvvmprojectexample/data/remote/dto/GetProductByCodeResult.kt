package com.dviltres.mvvmprojectexample.data.remote.dto

data class GetProductByCodeResult(
    val code: String,
    val product: ProductDto
)