package com.adityagupta.avengers

import com.adityagupta.avengers.data.AvengersList
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("marvel")
    suspend fun getQuotes(): Response<AvengersList>
}