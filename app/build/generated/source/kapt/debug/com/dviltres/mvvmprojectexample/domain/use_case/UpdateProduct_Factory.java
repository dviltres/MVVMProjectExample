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
public final class UpdateProduct_Factory implements Factory<UpdateProduct> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public UpdateProduct_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public UpdateProduct get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static UpdateProduct_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new UpdateProduct_Factory(productRepositoryProvider);
  }

  public static UpdateProduct newInstance(ProductRepository productRepository) {
    return new UpdateProduct(productRepository);
  }
}
