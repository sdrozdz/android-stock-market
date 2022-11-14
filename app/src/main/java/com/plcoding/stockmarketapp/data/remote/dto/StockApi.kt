package com.plcoding.stockmarketapp.data.remote.dto

import retrofit2.http.Query

interface StockApi {

    suspend fun getListings(
        @Query("apikey") apiKey: String
    )

    companion object {
        const val API_KEY = ""
        const val BASE_URL = ""
    }
}