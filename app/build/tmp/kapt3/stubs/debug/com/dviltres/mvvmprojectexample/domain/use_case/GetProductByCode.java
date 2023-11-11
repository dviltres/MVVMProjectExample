package com.dviltres.mvvmprojectexample.domain.use_case;

import com.dviltres.mvvmprojectexample.R;
import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.presentation.util.UiText;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dviltres/mvvmprojectexample/domain/use_case/GetProductByCode;", "", "productRepository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "(Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;)V", "invoke", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetProductByCode {
    private final com.dviltres.mvvmprojectexample.domain.repository.ProductRepository productRepository = null;
    
    @javax.inject.Inject
    public GetProductByCode(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.util.Resource<com.dviltres.mvvmprojectexample.domain.model.Product>> continuation) {
        return null;
    }
}