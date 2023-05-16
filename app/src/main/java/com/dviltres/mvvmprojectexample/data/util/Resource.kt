package com.dviltres.mvvmprojectexample.data.util

import com.dviltres.mvvmprojectexample.presentation.util.UiText


sealed class Resource<T>(val data: T? = null, val message: UiText? = null) {
    class Success<T>(data: T?): Resource<T>(data)
    class Error<T>(message: UiText, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? = null): Resource<T>(data)
}
