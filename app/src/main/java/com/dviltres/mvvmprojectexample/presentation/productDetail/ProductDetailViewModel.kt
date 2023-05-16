package com.dviltres.mvvmprojectexample.presentation.productDetail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dviltres.mvvmprojectexample.data.util.Resource
import com.dviltres.mvvmprojectexample.domain.use_case.ProductUseCases
import com.dviltres.mvvmprojectexample.presentation.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor(
 private val productUseCases: ProductUseCases,
 savedStateHandle: SavedStateHandle
):ViewModel() {

    var state by mutableStateOf(ProductDetailState())
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    init {
        savedStateHandle.get<String>("productCode")?.let { productCode ->
            if(productCode.isNotBlank()){
                getProduct(productCode)
            }
        }
    }

    fun onEvent(event: ProductDetailEvent) {
        when(event){
            is ProductDetailEvent.OnSetFavoriteProduct -> {
                state = state.copy(isFavorite = !state.isFavorite)
                setFavoriteProduct()
            }
        }
    }

    private fun getProduct(productCode: String) {
        viewModelScope.launch {
            productUseCases.getProductByCode(productCode).collect { result->
                when(result){
                    is Resource.Loading -> {
                        state = state.copy(isLoading = true)
                    }
                    is Resource.Success -> {
                        state = state.copy(
                            isLoading = false,
                            product = result.data,
                            isFavorite = result.data?.isFavorite ?:false
                        )
                    }
                    is Resource.Error -> {
                        state = state.copy(isLoading = false)
                        result.message?.let { message->
                            _uiEvent.send(UiEvent.ShowSnackbar(message))
                        }
                    }
                }
            }
        }
    }

    private fun setFavoriteProduct() {
        viewModelScope.launch {
            val updatedProduct = state.product?.apply {
                isFavorite = state.isFavorite
            }
            updatedProduct?.let {
                productUseCases.updateProduct(it).collect { result->
                    when(result){
                        is Resource.Loading -> {
                            state = state.copy(isLoading = true)
                        }
                        is Resource.Success -> {
                            state = state.copy(isLoading = false)
                        }
                        is Resource.Error -> {
                            state = state.copy(isLoading = false)
                            result.message?.let { message->
                                _uiEvent.send(UiEvent.ShowSnackbar(message))
                            }
                        }
                    }
                }
            }
        }
    }
}