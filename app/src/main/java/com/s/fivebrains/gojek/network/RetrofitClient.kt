package com.s.fivebrains.gojek.network

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import com.google.gson.GsonBuilder

object RetrofitClient {

    private const val BASE_URL = "https://github-trending-api.now.sh/"
    private var gson = GsonBuilder()
        .create()

    private fun getRetrofitClient() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun getApiService(): ServiceApi = getRetrofitClient().create(ServiceApi::class.java)
}