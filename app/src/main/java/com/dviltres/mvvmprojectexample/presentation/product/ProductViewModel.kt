package com.dviltres.mvvmprojectexample.presentation.product

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
class ProductViewModel @Inject constructor(
 private val productUseCases: ProductUseCases
):ViewModel() {

    var state by mutableStateOf(ProductState())
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    init {
        searchProducts()
    }

    fun onEvent(event: ProductEvent) {
        when(event){
            is ProductEvent.OnQueryChange -> {
                state = state.copy(query = event.query)
            }
            is ProductEvent.OnSearchFocusChange -> {
                state = state.copy(isHintVisible = !event.isFocused && state.query.isBlank())
            }
            ProductEvent.OnSearch -> {
                searchProducts()
            }
        }
    }

    private fun searchProducts(){
        viewModelScope.launch {
            state = state.copy(products = emptyList(), isLoading = true)
            productUseCases.searchProducts(state.query).let { result->
                when(result){
                    is Resource.Loading -> {
                        state = state.copy(isLoading = true)
                    }
                    is Resource.Success -> {
                        state = state.copy(
                            isLoading = false,
                            products = result?.data ?: emptyList()
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

}