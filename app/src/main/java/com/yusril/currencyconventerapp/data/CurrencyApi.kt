package com.yusril.currencyconventerapp.data

import com.yusril.currencyconventerapp.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyApi {

    @Headers("apikey: M6h7xmxeZhepfr6NBNaVHHl57unC8Zfs")
    @GET("latest")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}