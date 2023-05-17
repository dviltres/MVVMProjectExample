package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UpdateProduct @Inject constructor(
    private val productRepository: ProductRepository
){
    operator fun invoke(product:Product): Flow<Resource<Boolean>> = flow {
        try {
            val isFavoriteProduct = productRepository.getFavoriteProduct(product.productCode)
            if(product.isFavorite && isFavoriteProduct == null)
                productRepository.insertProduct(product)
            else
                productRepository.deleteProduct(product)

            emit(Resource.Success(true))
        }
        catch (e:Exception){
           emit(Resource.Error(UiText.DynamicString(e?.message ?:"We're sorry! An unexpected error has occurred")))
        }
    }
}