package com.dviltres.mvvmprojectexample.presentation.product

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.dviltres.mvvmprojectexample.R
import com.dviltres.mvvmprojectexample.presentation.components.SearchTextField
import com.dviltres.mvvmprojectexample.presentation.product.components.ProductItem
import com.dviltres.mvvmprojectexample.presentation.theme.LocalSpacing
import com.dviltres.mvvmprojectexample.presentation.util.Screen
import com.dviltres.mvvmprojectexample.presentation.util.UiEvent
import kotlinx.coroutines.flow.Flow

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ProductsScreen(
    state:ProductState,
    onEvent:(ProductEvent) -> Unit,
    uiEvent: Flow<UiEvent>,
    navController:NavController,
    scaffoldState:ScaffoldState
){
    val spacing = LocalSpacing.current
    val context = LocalContext.current

    val keyboardController = LocalSoftwareKeyboardController.current
    LaunchedEffect(key1 = keyboardController) {
        uiEvent.collect { event ->
            when (event) {
                is UiEvent.ShowSnackbar -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message.asString(context)
                    )
                    keyboardController?.hide()
                }
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(spacing.spaceMedium)
    ) {
        SearchTextField(
            text = state.query,
            onValueChange = {
                onEvent(ProductEvent.OnQueryChange(it))
            },
            shouldShowHint = state.isHintVisible,
            onSearch = {
                keyboardController?.hide()
                onEvent(ProductEvent.OnSearch)
            },
            onFocusChanged = {
               onEvent(ProductEvent.OnSearchFocusChange(it.isFocused))
            }
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.products){ product->
                ProductItem(
                    product = product,
                    onClick = {
                        navController.navigate(Screen.ProductDetailScreen.route+"?productCode=${product.productCode}")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when {
            state.isLoading -> CircularProgressIndicator()
            state.products.isEmpty() -> {
                Text(
                    text = stringResource(id = R.string.no_results),
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}