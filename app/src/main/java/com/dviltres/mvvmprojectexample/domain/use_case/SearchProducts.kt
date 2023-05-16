package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchProducts @Inject constructor(
    private val repository: ProductRepository
) {
    operator fun invoke(
        query: String,
        page: Int = 1,
        pageSize: Int = 40
    ): Flow<Resource<List<Product>>> = flow {
        emit(Resource.Loading())
        val products = repository.searchProducts(query.trim(), page, pageSize)
        emit(products)
    }
}