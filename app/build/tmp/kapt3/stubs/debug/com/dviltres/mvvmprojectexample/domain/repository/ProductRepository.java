package com.dviltres.mvvmprojectexample.domain.repository;

import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.model.Product;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J5\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/dviltres/mvvmprojectexample/domain/repository/ProductRepository;", "", "deleteProduct", "", "product", "Lcom/dviltres/mvvmprojectexample/domain/model/Product;", "(Lcom/dviltres/mvvmprojectexample/domain/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteProduct", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCode", "insertProduct", "searchProducts", "Lcom/dviltres/mvvmprojectexample/data/util/Resource;", "", "query", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProduct", "app_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object searchProducts(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page, int pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.util.Resource<java.util.List<com.dviltres.mvvmprojectexample.domain.model.Product>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProductByCode(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.domain.model.Product> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFavoriteProduct(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.domain.model.Product> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.model.Product product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}