package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import javax.inject.Inject

class UpdateProduct @Inject constructor(
    private val productRepository: ProductRepository
){
   suspend operator fun invoke(product:Product): Resource<Boolean> {
       return try {
           val isFavoriteProduct = productRepository.getFavoriteProduct(product.productCode)
           if(product.isFavorite && isFavoriteProduct == null)
               productRepository.insertProduct(product)
           else
               productRepository.deleteProduct(product)

           Resource.Success(true)
       } catch (e:Exception){
           Resource.Error(UiText.DynamicString(e.message.toString()))
       }
    }
}