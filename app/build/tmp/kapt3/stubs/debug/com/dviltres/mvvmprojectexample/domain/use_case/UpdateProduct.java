package com.dviltres.mvvmprojectexample.domain.use_case;

import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.presentation.util.UiText;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/dviltres/mvvmprojectexample/domain/use_case/UpdateProduct;", "", "productRepository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "(Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "", "product", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "app_debug"})
public final class UpdateProduct {
    private final com.dviltres.mvvmprojectexample.domain.repository.ProductRepository productRepository = null;
    
    @javax.inject.Inject
    public UpdateProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.data.util.Resource<java.lang.Boolean>> invoke(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product) {
        return null;
    }
}