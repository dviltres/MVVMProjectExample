package com.dviltres.mvvmprojectexample.data.remote;

import com.dviltres.mvvmprojectexample.data.remote.dto.GetProductByCodeResult;
import com.dviltres.mvvmprojectexample.data.remote.dto.SearchDto;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/dviltres/mvvmprojectexample/data/remote/OpenFoodApi;", "", "getProductByCode", "Lcom/dviltres/mvvmprojectexample/data/remote/dto/GetProductByCodeResult;", "productCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchFood", "Lcom/dviltres/mvvmprojectexample/data/remote/dto/SearchDto;", "query", "page", "", "pageSize", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface OpenFoodApi {
    @org.jetbrains.annotations.NotNull
    public static final com.dviltres.mvvmprojectexample.data.remote.OpenFoodApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://us.openfoodfacts.org/";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "cgi/search.pl?search_simple=1&json=1&action=process&fields=code,product_name,nutriments,image_front_url")
    public abstract java.lang.Object searchFood(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "search_terms")
    java.lang.String query, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "page_size")
    int pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.remote.dto.SearchDto> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "api/v2/product/{productCode}")
    public abstract java.lang.Object getProductByCode(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "productCode")
    java.lang.String productCode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dviltres.mvvmprojectexample.data.remote.dto.GetProductByCodeResult> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dviltres/mvvmprojectexample/data/remote/OpenFoodApi$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://us.openfoodfacts.org/";
        
        private Companion() {
            super();
        }
    }
}