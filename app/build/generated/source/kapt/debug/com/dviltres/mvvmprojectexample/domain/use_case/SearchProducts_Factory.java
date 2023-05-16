package com.dviltres.mvvmprojectexample.domain.use_case;

import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
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
public final class SearchProducts_Factory implements Factory<SearchProducts> {
  private final Provider<ProductRepository> repositoryProvider;

  public SearchProducts_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchProducts get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchProducts_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new SearchProducts_Factory(repositoryProvider);
  }

  public static SearchProducts newInstance(ProductRepository repository) {
    return new SearchProducts(repository);
  }
}
