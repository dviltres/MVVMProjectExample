package com.dviltres.mvvmprojectexample.di;

import com.dviltres.mvvmprojectexample.data.local.MyAppDatabase;
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi;
import com.dviltres.mvvmprojectexample.data.repository.ProductRepositoryImpl;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/dviltres/mvvmprojectexample/di/RepositoryModule;", "", "()V", "provideProductRepository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "api", "Lcom/dviltres/mvvmprojectexample/data/remote/OpenFoodApi;", "myAppDatabase", "Lcom/dviltres/mvvmprojectexample/data/local/MyAppDatabase;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.dviltres.mvvmprojectexample.domain.repository.ProductRepository provideProductRepository(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi api, @org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.local.MyAppDatabase myAppDatabase) {
        return null;
    }
}