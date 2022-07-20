package com.yusril.currencyconventerapp.data.models

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/latest")
    suspend fun getCurrency(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}