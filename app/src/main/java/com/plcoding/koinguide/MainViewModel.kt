package com.plcoding.koinguide

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
): ViewModel() {

    fun doNetworkCall() {
        println("Something")
    }
}