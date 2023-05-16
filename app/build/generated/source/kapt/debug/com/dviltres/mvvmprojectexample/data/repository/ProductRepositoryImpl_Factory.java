package com.dviltres.mvvmprojectexample.data.repository;

import com.dviltres.mvvmprojectexample.data.local.ProductDao;
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<OpenFoodApi> apiProvider;

  private final Provider<ProductDao> daoProvider;

  public ProductRepositoryImpl_Factory(Provider<OpenFoodApi> apiProvider,
      Provider<ProductDao> daoProvider) {
    this.apiProvider = apiProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(apiProvider.get(), daoProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<OpenFoodApi> apiProvider,
      Provider<ProductDao> daoProvider) {
    return new ProductRepositoryImpl_Factory(apiProvider, daoProvider);
  }

  public static ProductRepositoryImpl newInstance(OpenFoodApi api, ProductDao dao) {
    return new ProductRepositoryImpl(api, dao);
  }
}
