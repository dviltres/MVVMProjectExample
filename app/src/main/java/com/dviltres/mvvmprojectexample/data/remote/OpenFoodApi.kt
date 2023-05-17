package com.dviltres.mvvmprojectexample.data.remote

import com.dviltres.mvvmprojectexample.data.remote.dto.GetProductByCodeResult
import com.dviltres.mvvmprojectexample.data.remote.dto.SearchDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OpenFoodApi {

    @GET("cgi/search.pl?search_simple=1&json=1&action=process&fields=code,product_name,nutriments,image_front_url")
    suspend fun searchFood(
        @Query("search_terms") query: String,
        @Query("page") page: Int,
        @Query("page_size") pageSize: Int
    ): SearchDto

    @GET("api/v2/product/{productCode}")
    suspend fun getProductByCode(
        @Path("productCode") productCode: String,
    ): GetProductByCodeResult

    companion object {
        const val BASE_URL = "https://us.openfoodfacts.org/"
    }
}