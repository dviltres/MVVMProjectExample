package com.dviltres.mvvmprojectexample.data.local;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/dviltres/mvvmprojectexample/data/local/ProductDao;", "", "deleteProduct", "", "productEntity", "Lcom/dviltres/mvvmprojectexample/data/local/entity/ProductEntity;", "(Lcom/dviltres/mvvmprojectexample/data/local/entity/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCode", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProduct", "updateProduct", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity productEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update(onConflict = 1)
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity productEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM PRODUCT_TABLE WHERE productCode =:productCode")
    public abstract java.lang.Object getProductByCode(@org.jetbrains.annotations.NotNull
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.data.local.entity.ProductEntity productEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}