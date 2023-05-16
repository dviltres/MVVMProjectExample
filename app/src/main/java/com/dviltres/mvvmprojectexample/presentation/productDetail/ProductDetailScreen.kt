package com.dviltres.mvvmprojectexample.presentation.productDetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.dviltres.mvvmprojectexample.R
import com.dviltres.mvvmprojectexample.domain.model.Product
import com.dviltres.mvvmprojectexample.presentation.product.components.NutrientInfo
import com.dviltres.mvvmprojectexample.presentation.theme.LocalSpacing
import com.dviltres.mvvmprojectexample.presentation.util.Screen
import com.dviltres.mvvmprojectexample.presentation.util.UiEvent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Composable
fun ProductDetailScreen(
    state:ProductDetailState,
    onEvent:(ProductDetailEvent) -> Unit,
    uiEvent: Flow<UiEvent>,
    navController:NavController,
    scaffoldState:ScaffoldState
){
    val spacing = LocalSpacing.current
    val context = LocalContext.current

    LaunchedEffect(key1 = true) {
        uiEvent.collect { event ->
            when (event) {
                is UiEvent.ShowSnackbar -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.message.asString(context)
                    )
                }
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        state.product?.let { product->
            Box( modifier = Modifier.fillMaxWidth(),
            ) {
                IconButton(
                    onClick = {
                        navController.navigate(Screen.ProductsScreen.route)
                    },
                    modifier = Modifier.align(Alignment.TopStart)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        modifier = Modifier.size(30.dp)
                    )
                }
                Image(
                    painter = rememberAsyncImagePainter(
                        ImageRequest.Builder(context).data(data = product.imageUrl)
                            .apply(block = fun ImageRequest.Builder.() {
                                crossfade(true)
                                error(R.drawable.ic_burger)
                                fallback(R.drawable.ic_burger)
                            }).build()
                    ),
                    contentDescription = product.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(250.dp).align(Alignment.Center)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colors.primary)
                    .padding(
                        start = spacing.spaceMedium,
                        end = spacing.spaceMedium,
                        top = spacing.spaceExtraSmall,
                        bottom = spacing.spaceExtraSmall
                    ),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column(modifier = Modifier.weight(0.9F)) {
                    Text(
                        text = product.name,
                        style = MaterialTheme.typography.h6,
                        textAlign = TextAlign.Start,
                        color = MaterialTheme.colors.onPrimary
                    )
                }
                Column(modifier = Modifier.weight(0.1F)) {
                    IconButton(
                        onClick = {
                            onEvent(ProductDetailEvent.OnSetFavoriteProduct)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = "",
                            tint =  if(product.isFavorite) Color.Red else Color.White
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = stringResource(id = R.string.nutrient_info),
                    style = MaterialTheme.typography.h6,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Spacer(modifier = Modifier.height(spacing.spaceSmall))
            Row(modifier = Modifier.fillMaxWidth(),
                 horizontalArrangement = Arrangement.Center
            ) {
                NutrientInfo(
                    name = stringResource(id = R.string.carbs),
                    amount = product.carbsPer100g,
                    unit = stringResource(id = R.string.grams),
                    amountTextSize = 16.sp,
                    unitTextSize = 12.sp,
                    nameTextStyle = MaterialTheme.typography.body2
                )
                Spacer(modifier = Modifier.width(spacing.spaceMedium))
                NutrientInfo(
                    name = stringResource(id = R.string.protein),
                    amount = product.proteinPer100g,
                    unit = stringResource(id = R.string.grams),
                    amountTextSize = 16.sp,
                    unitTextSize = 12.sp,
                    nameTextStyle = MaterialTheme.typography.body2
                )
                Spacer(modifier = Modifier.width(spacing.spaceMedium))
                NutrientInfo(
                    name = stringResource(id = R.string.fat),
                    amount = product.fatPer100g,
                    unit = stringResource(id = R.string.grams),
                    amountTextSize = 16.sp,
                    unitTextSize = 12.sp,
                    nameTextStyle = MaterialTheme.typography.body2
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
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDetailScreenPreview(){
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()

    ProductDetailScreen(
        state = ProductDetailState(
            isLoading = false,
            product = Product(
                productCode = "3017620422003",
                name = "Nutella",
                imageUrl = "",
                caloriesPer100g = 0,
                carbsPer100g = 0,
                proteinPer100g = 0,
                fatPer100g = 0,
                isFavorite = false
            )
        ),
        onEvent = {},
        uiEvent = flow {  },
        navController = navController,
        scaffoldState = scaffoldState
    )
}