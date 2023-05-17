package com.dviltres.mvvmprojectexample.presentation.product

sealed class ProductEvent {
    data class OnQueryChange(val query:String):ProductEvent()
    data class OnSearchFocusChange(val isFocused:Boolean):ProductEvent()
    object OnSearch:ProductEvent()
}
