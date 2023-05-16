package com.dviltres.mvvmprojectexample.presentation.product;

import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases;
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
public final class ProductViewModel_Factory implements Factory<ProductViewModel> {
  private final Provider<ProductUseCases> productUseCasesProvider;

  public ProductViewModel_Factory(Provider<ProductUseCases> productUseCasesProvider) {
    this.productUseCasesProvider = productUseCasesProvider;
  }

  @Override
  public ProductViewModel get() {
    return newInstance(productUseCasesProvider.get());
  }

  public static ProductViewModel_Factory create(Provider<ProductUseCases> productUseCasesProvider) {
    return new ProductViewModel_Factory(productUseCasesProvider);
  }

  public static ProductViewModel newInstance(ProductUseCases productUseCases) {
    return new ProductViewModel(productUseCases);
  }
}
