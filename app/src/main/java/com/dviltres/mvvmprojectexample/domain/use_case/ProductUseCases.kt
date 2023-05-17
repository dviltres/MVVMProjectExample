package com.dviltres.mvvmprojectexample.domain.use_case

data class ProductUseCases(
    val searchProducts:SearchProducts,
    val getProductByCode:GetProductByCode,
    val updateProduct:UpdateProduct
)
