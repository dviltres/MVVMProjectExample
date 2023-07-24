package com.dviltres.mvvmprojectexample.domain.use_case

import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.presentation.util.UiText
import javax.inject.Inject

class SearchProducts @Inject constructor(
    private val repository: ProductRepository
) {
   suspend operator fun invoke(query: String, page: Int = 1, pageSize: Int = 40): Resource<List<Product>>{
       return try {
           repository.searchProducts(query.trim(), page, pageSize)
       } catch (e:Exception){
           Resource.Error(UiText.DynamicString(e.message.toString()))
       }
    }
}