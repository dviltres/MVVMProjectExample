package com.dviltres.mvvmprojectexample.presentation.productDetail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases;
import com.dviltres.mvvmprojectexample.presentation.util.UiEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u0018H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "productUseCases", "Lcom/dviltres/mvvmprojectexample/domain/use_case/ProductUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/dviltres/mvvmprojectexample/domain/use_case/ProductUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/dviltres/mvvmprojectexample/presentation/util/UiEvent;", "<set-?>", "Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailState;", "state", "getState", "()Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailState;", "setState", "(Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "getProduct", "", "productCode", "", "onEvent", "event", "Lcom/dviltres/mvvmprojectexample/presentation/productDetail/ProductDetailEvent;", "setFavoriteProduct", "app_debug"})
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases productUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases productUseCases, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailState getState() {
        return null;
    }
    
    private final void setState(com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailEvent event) {
    }
    
    private final void getProduct(java.lang.String productCode) {
    }
    
    private final void setFavoriteProduct() {
    }
}