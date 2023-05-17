package com.dviltres.mvvmprojectexample.di

import com.dviltres.mvvmprojectexample.data.local.MyAppDatabase
import com.dviltres.mvvmprojectexample.data.local.ProductDao
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi
import com.dviltres.mvvmprojectexample.data.repository.ProductRepositoryImpl
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideProductRepository(api: OpenFoodApi, myAppDatabase: MyAppDatabase): ProductRepository {
        return ProductRepositoryImpl(api = api, dao = myAppDatabase.productDao)
    }
}