package com.dviltres.mvvmprojectexample.data.remote.dto

import com.google.gson.annotations.SerializedName


data class ProductDto(
    @SerializedName("image_front_url")
    val imageFrontUrl: String?,
    val nutriments: NutrimentsDto,
    @SerializedName("product_name")
    val productName: String,
    @SerializedName("code")
    val productCode:String?
)