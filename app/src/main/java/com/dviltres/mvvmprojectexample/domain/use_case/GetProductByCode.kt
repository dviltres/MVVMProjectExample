package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.R
import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import javax.inject.Inject

class GetProductByCode @Inject constructor(
    private val productRepository: ProductRepository
){
    suspend operator fun invoke(productCode:String): Resource<Product> {
        try {
            var product = productRepository.getProductByCode(productCode)
                ?: return Resource.Error(UiText.StringResource(R.string.product_does_not_exist))

            val isFavoriteProduct = productRepository.getFavoriteProduct(productCode)

            if(isFavoriteProduct != null ){
                product.apply {
                    isFavorite = true
                }
            }
            return Resource.Success(product)
        }
        catch (e:Exception){
           return Resource.Error(UiText.DynamicString(e.message.toString()))
        }
    }
}