package com.dviltres.mvvmprojectexample.presentation.util

sealed class UiEvent {
    data class ShowSnackbar(val message: UiText): UiEvent()
}
