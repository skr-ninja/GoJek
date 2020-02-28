package com.s.fivebrains.gojek.network

import com.s.fivebrains.gojek.response.TrendingRepo
import retrofit2.Call
import retrofit2.http.GET


interface ServiceApi {

    // getTrendingRepo
    @GET("repositories")
     fun getTrendingRepo(
    ): Call<TrendingRepo>
}