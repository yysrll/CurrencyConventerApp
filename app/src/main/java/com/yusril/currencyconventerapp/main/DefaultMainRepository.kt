package com.yusril.currencyconventerapp.main

import com.yusril.currencyconventerapp.data.CurrencyApi
import com.yusril.currencyconventerapp.data.models.CurrencyResponse
import com.yusril.currencyconventerapp.utils.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
    ) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (result != null && response.isSuccessful) {
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }
        } catch (e: Exception) {
            Resource.Error(e.message ?: "Error Occurred!")
        }
    }

}