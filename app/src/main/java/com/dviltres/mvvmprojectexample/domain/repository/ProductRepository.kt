package com.dviltres.mvvmprojectexample.domain.repository

import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product

interface ProductRepository {
    suspend fun searchProducts(
        query: String,
        page: Int,
        pageSize: Int
    ): Resource<List<Product>>

    suspend fun getProductByCode(productCode:String):Product?

    suspend fun insertProduct(product: Product)

    suspend fun updateProduct(product:Product)

    suspend fun getFavoriteProduct(productCode:String):Product?

    suspend fun deleteProduct(product:Product)
}