package com.dviltres.mvvmprojectexample.di;

import com.dviltres.mvvmprojectexample.data.local.MyAppDatabase;
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RepositoryModule_ProvideProductRepositoryFactory implements Factory<ProductRepository> {
  private final RepositoryModule module;

  private final Provider<OpenFoodApi> apiProvider;

  private final Provider<MyAppDatabase> myAppDatabaseProvider;

  public RepositoryModule_ProvideProductRepositoryFactory(RepositoryModule module,
      Provider<OpenFoodApi> apiProvider, Provider<MyAppDatabase> myAppDatabaseProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
    this.myAppDatabaseProvider = myAppDatabaseProvider;
  }

  @Override
  public ProductRepository get() {
    return provideProductRepository(module, apiProvider.get(), myAppDatabaseProvider.get());
  }

  public static RepositoryModule_ProvideProductRepositoryFactory create(RepositoryModule module,
      Provider<OpenFoodApi> apiProvider, Provider<MyAppDatabase> myAppDatabaseProvider) {
    return new RepositoryModule_ProvideProductRepositoryFactory(module, apiProvider, myAppDatabaseProvider);
  }

  public static ProductRepository provideProductRepository(RepositoryModule instance,
      OpenFoodApi api, MyAppDatabase myAppDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductRepository(api, myAppDatabase));
  }
}
