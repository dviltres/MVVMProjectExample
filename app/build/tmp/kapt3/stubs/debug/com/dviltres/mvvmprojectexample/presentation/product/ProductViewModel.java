package com.dviltres.mvvmprojectexample.presentation.product;

import androidx.lifecycle.ViewModel;
import com.dviltres.mvvmprojectexample.data.util.Resource;
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases;
import com.dviltres.mvvmprojectexample.presentation.util.UiEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001a"}, d2 = {"Lcom/dviltres/mvvmprojectexample/presentation/product/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "productUseCases", "Lcom/dviltres/mvvmprojectexample/domain/use_case/ProductUseCases;", "(Lcom/dviltres/mvvmprojectexample/domain/use_case/ProductUseCases;)V", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/dviltres/mvvmprojectexample/presentation/util/UiEvent;", "<set-?>", "Lcom/dviltres/mvvmprojectexample/presentation/product/ProductState;", "state", "getState", "()Lcom/dviltres/mvvmprojectexample/presentation/product/ProductState;", "setState", "(Lcom/dviltres/mvvmprojectexample/presentation/product/ProductState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "uiEvent", "Lkotlinx/coroutines/flow/Flow;", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "onEvent", "", "event", "Lcom/dviltres/mvvmprojectexample/presentation/product/ProductEvent;", "searchProducts", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases productUseCases = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject
    public ProductViewModel(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases productUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dviltres.mvvmprojectexample.presentation.product.ProductState getState() {
        return null;
    }
    
    private final void setState(com.dviltres.mvvmprojectexample.presentation.product.ProductState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.dviltres.mvvmprojectexample.presentation.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.dviltres.mvvmprojectexample.presentation.product.ProductEvent event) {
    }
    
    private final void searchProducts() {
    }
}