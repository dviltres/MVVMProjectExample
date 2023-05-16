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
public final class GetProductByCode_Factory implements Factory<GetProductByCode> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetProductByCode_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetProductByCode get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetProductByCode_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetProductByCode_Factory(productRepositoryProvider);
  }

  public static GetProductByCode newInstance(ProductRepository productRepository) {
    return new GetProductByCode(productRepository);
  }
}
