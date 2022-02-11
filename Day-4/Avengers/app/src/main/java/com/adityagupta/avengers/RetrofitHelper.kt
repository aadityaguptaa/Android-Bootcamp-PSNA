package com.adityagupta.avengers

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

  var baseUrl = "https://simplifiedcoding.net/demos/"

    fun getInstance() : Retrofit{

        var gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create(gson)).build()
    }




}