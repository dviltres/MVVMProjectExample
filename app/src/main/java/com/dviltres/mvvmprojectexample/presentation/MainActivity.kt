package com.dviltres.mvvmprojectexample.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dviltres.mvvmprojectexample.presentation.theme.MVVMProjectExampleTheme
import com.dviltres.mvvmprojectexample.presentation.product.ProductsScreen
import com.dviltres.mvvmprojectexample.presentation.product.ProductViewModel
import com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailScreen
import com.dviltres.mvvmprojectexample.presentation.productDetail.ProductDetailViewModel
import com.dviltres.mvvmprojectexample.presentation.util.Screen
import dagger.hilt.android.AndroidEntryPoint


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMProjectExampleTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    NavHost(navController = navController, startDestination = Screen.ProductsScreen.route) {
                        composable(Screen.ProductsScreen.route) {
                            val viewModel = hiltViewModel<ProductViewModel>()
                            ProductsScreen(
                                state = viewModel.state,
                                onEvent = viewModel::onEvent,
                                uiEvent = viewModel.uiEvent,
                                navController = navController,
                                scaffoldState = scaffoldState
                            )
                        }
                        composable(Screen.ProductDetailScreen.route + "?productCode={productCode}",
                            arguments = listOf(
                                navArgument("productCode") {
                                    type = NavType.StringType
                                    defaultValue = ""
                                }
                            )
                        ){
                            val viewModel = hiltViewModel<ProductDetailViewModel>()
                            ProductDetailScreen(
                                state = viewModel.state,
                                onEvent = viewModel::onEvent,
                                uiEvent = viewModel.uiEvent,
                                navController = navController,
                                scaffoldState = scaffoldState
                            )
                        }
                    }
                }
            }
        }
    }
}
