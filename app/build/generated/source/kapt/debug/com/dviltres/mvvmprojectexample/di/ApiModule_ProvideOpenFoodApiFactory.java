package com.dviltres.mvvmprojectexample.di;

import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class ApiModule_ProvideOpenFoodApiFactory implements Factory<OpenFoodApi> {
  private final Provider<OkHttpClient> clientProvider;

  public ApiModule_ProvideOpenFoodApiFactory(Provider<OkHttpClient> clientProvider) {
    this.clientProvider = clientProvider;
  }

  @Override
  public OpenFoodApi get() {
    return provideOpenFoodApi(clientProvider.get());
  }

  public static ApiModule_ProvideOpenFoodApiFactory create(Provider<OkHttpClient> clientProvider) {
    return new ApiModule_ProvideOpenFoodApiFactory(clientProvider);
  }

  public static OpenFoodApi provideOpenFoodApi(OkHttpClient client) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideOpenFoodApi(client));
  }
}
