package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.R
import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetProductByCode @Inject constructor(
    private val productRepository: ProductRepository
){
    operator fun invoke(productCode:String): Flow<Resource<Product>> = flow {
        emit(Resource.Loading())
        var product = productRepository.getProductByCode(productCode)
            ?: return@flow emit(Resource.Error(UiText.StringResource(R.string.product_does_not_exist)))

        val isFavoriteProduct = productRepository.getFavoriteProduct(productCode)

        if(isFavoriteProduct != null ){
            product.apply {
                isFavorite = true
            }
        }
        emit(Resource.Success(product))
    }
}