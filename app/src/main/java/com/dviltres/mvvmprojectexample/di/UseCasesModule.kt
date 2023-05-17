package com.dviltres.mvvmprojectexample.di

import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import com.dviltres.mvvmprojectexample.domain.use_case.GetProductByCode
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases
import com.dviltres.mvvmprojectexample.domain.use_case.SearchProducts
import com.dviltres.mvvmprojectexample.domain.use_case.UpdateProduct
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    @Provides
    @Singleton
    fun provideProductUseCases(repository: ProductRepository): ProductUseCases {
        return ProductUseCases(
            searchProducts = SearchProducts(repository),
            getProductByCode = GetProductByCode(repository),
            updateProduct = UpdateProduct(repository)
        )
    }

}