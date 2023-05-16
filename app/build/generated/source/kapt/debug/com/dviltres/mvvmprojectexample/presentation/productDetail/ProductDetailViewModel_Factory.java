package com.dviltres.mvvmprojectexample.presentation.productDetail;

import androidx.lifecycle.SavedStateHandle;
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
public final class ProductDetailViewModel_Factory implements Factory<ProductDetailViewModel> {
  private final Provider<ProductUseCases> productUseCasesProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ProductDetailViewModel_Factory(Provider<ProductUseCases> productUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.productUseCasesProvider = productUseCasesProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public ProductDetailViewModel get() {
    return newInstance(productUseCasesProvider.get(), savedStateHandleProvider.get());
  }

  public static ProductDetailViewModel_Factory create(
      Provider<ProductUseCases> productUseCasesProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ProductDetailViewModel_Factory(productUseCasesProvider, savedStateHandleProvider);
  }

  public static ProductDetailViewModel newInstance(ProductUseCases productUseCases,
      SavedStateHandle savedStateHandle) {
    return new ProductDetailViewModel(productUseCases, savedStateHandle);
  }
}
