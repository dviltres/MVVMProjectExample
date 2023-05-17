package com.dviltres.mvvmprojectexample.data.repository

import com.dviltres.mvvmprojectexample.data.local.ProductDao
import com.dviltres.mvvmprojectexample.data.mapper.toProduct
import com.dviltres.mvvmprojectexample.data.mapper.toProductEntity
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi
import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val api:OpenFoodApi,
    private val dao: ProductDao
): ProductRepository {
    override suspend fun searchProducts(
        query: String,
        page: Int,
        pageSize: Int,
    ): Resource<List<Product>> {
       return try {
           val searchDto = api.searchFood(
               query = query,
               page = page,
               pageSize = pageSize
           ).products.mapNotNull {
                it.toProduct()
           }
           Resource.Success(searchDto)
        } catch(e: Exception) {
           Resource.Error(UiText.DynamicString(e?.message ?:"We're sorry! An unexpected error has occurred"))
        }
    }

    override suspend fun getProductByCode(productCode: String): Product? {
        return try {
            api.getProductByCode(productCode).product.toProduct()
        } catch(e: Exception) {
           null
        }
    }

    override suspend fun insertProduct(product: Product) {
        dao.insertProduct(product.toProductEntity())
    }

    override suspend fun updateProduct(product: Product) {
        dao.updateProduct(product.toProductEntity())
    }

    override suspend fun getFavoriteProduct(productCode: String): Product? {
        return dao.getProductByCode(productCode)?.toProduct()
    }

    override suspend fun deleteProduct(product:Product) {
        dao.deleteProduct(product.toProductEntity())
    }
}