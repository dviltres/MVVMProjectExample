package com.dviltres.mvvmprojectexample.di;

import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases;
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
public final class UseCasesModule_ProvideProductUseCasesFactory implements Factory<ProductUseCases> {
  private final UseCasesModule module;

  private final Provider<ProductRepository> repositoryProvider;

  public UseCasesModule_ProvideProductUseCasesFactory(UseCasesModule module,
      Provider<ProductRepository> repositoryProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProductUseCases get() {
    return provideProductUseCases(module, repositoryProvider.get());
  }

  public static UseCasesModule_ProvideProductUseCasesFactory create(UseCasesModule module,
      Provider<ProductRepository> repositoryProvider) {
    return new UseCasesModule_ProvideProductUseCasesFactory(module, repositoryProvider);
  }

  public static ProductUseCases provideProductUseCases(UseCasesModule instance,
      ProductRepository repository) {
    return Preconditions.checkNotNullFromProvides(instance.provideProductUseCases(repository));
  }
}
