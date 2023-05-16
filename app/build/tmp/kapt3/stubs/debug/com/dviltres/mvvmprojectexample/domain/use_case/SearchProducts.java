package com.dviltres.mvvmprojectexample.domain.use_case;

import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dviltres/mvvmprojectexample/domain/use_case/SearchProducts;", "", "repository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "(Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "query", "", "page", "", "pageSize", "app_debug"})
public final class SearchProducts {
    private final com.dviltres.mvvmprojectexample.domain.repository.ProductRepository repository = null;
    
    @javax.inject.Inject
    public SearchProducts(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.data.util.Resource<java.util.List<com.dviltres.mvvmprojectexample.domain.model.Product>>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page, int pageSize) {
        return null;
    }
}