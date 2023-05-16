package com.dviltres.mvvmprojectexample.di;

import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.domain.use_case.GetProductByCode;
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases;
import com.dviltres.mvvmprojectexample.domain.use_case.SearchProducts;
import com.dviltres.mvvmprojectexample.domain.use_case.UpdateProduct;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/dviltres/mvvmprojectexample/di/UseCasesModule;", "", "()V", "provideProductUseCases", "Lcom/dviltres/mvvmprojectexample/domain/use_case/ProductUseCases;", "repository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "app_debug"})
@dagger.Module
public final class UseCasesModule {
    
    public UseCasesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases provideProductUseCases(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.repository.ProductRepository repository) {
        return null;
    }
}