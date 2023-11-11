package com.dviltres.mvvmprojectexample.domain.use_case;

import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.presentation.util.UiText;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/dviltres/mvvmprojectexample/domain/use_case/SearchProducts;", "", "repository", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "(Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;)V", "invoke", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "query", "", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SearchProducts {
    private final com.dviltres.mvvmprojectexample.domain.repository.ProductRepository repository = null;
    
    @javax.inject.Inject
    public SearchProducts(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.util.Resource<java.util.List<com.dviltres.mvvmprojectexample.domain.model.Product>>> continuation) {
        return null;
    }
}