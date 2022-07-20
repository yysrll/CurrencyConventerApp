package com.yusril.currencyconventerapp.main

import com.yusril.currencyconventerapp.data.models.CurrencyResponse
import com.yusril.currencyconventerapp.utils.Resource

interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}