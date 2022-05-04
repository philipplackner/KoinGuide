package com.plcoding.koinguide

class MainRepositoryImpl(
    private val api: MyApi
): MainRepository {

    override fun doNetworkCall() {
        api.callApi()
    }
}