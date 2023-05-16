package com.dviltres.mvvmprojectexample.presentation.productDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailEvent;", "", "()V", "OnSetFavoriteProduct", "Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailEvent$OnSetFavoriteProduct;", "app_debug"})
public abstract class ProductDetailEvent {
    
    private ProductDetailEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailEvent$OnSetFavoriteProduct;", "Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailEvent;", "()V", "app_debug"})
    public static final class OnSetFavoriteProduct extends com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailEvent.OnSetFavoriteProduct INSTANCE = null;
        
        private OnSetFavoriteProduct() {
            super();
        }
    }
}