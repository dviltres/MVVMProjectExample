package com.dviltres.mvvmprojectexample.data.repository;

import com.dviltres.mvvmprojectexample.data.local.ProductDao;
import com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi;
import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;
import com.dviltres.mvvmprojectexample.domain.repository.ProductRepository;
import com.dviltres.mvvmprojectexample.presentation.util.UiText;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ5\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/dviltres/mvvmprojectexample/data/repository/ProductRepositoryImpl;", "Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "api", "Lcom/dviltres/mvvmprojectexample/data/remote/OpenFoodApi;", "dao", "Lcom/dviltres/mvvmprojectexample/data/local/ProductDao;", "(Lcom/dviltres/mvvmprojectexample/data/remote/OpenFoodApi;Lcom/dviltres/mvvmprojectexample/data/local/ProductDao;)V", "deleteProduct", "", "product", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "(Lcom/dviltres/mvvmprojectexample/domain/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteProduct", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCode", "insertProduct", "searchProducts", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "", "query", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProduct", "app_debug"})
public final class ProductRepositoryImpl implements com.dviltres.mvvmprojectexample.domain.repository.ProductRepository {
    private final com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi api = null;
    private final com.dviltres.mvvmprojectexample.data.local.ProductDao dao = null;
    
    @javax.inject.Inject
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi api, @org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.local.ProductDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object searchProducts(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.util.Resource<java.util.List<com.dviltres.mvvmprojectexample.domain.model.Product>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProductByCode(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.domain.model.Product> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getFavoriteProduct(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.domain.model.Product> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}