package com.example.batmanproj.api

import com.example.batmanproj.model.BatmanDetail
import com.example.batmanproj.model.BatmanList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("http://www.omdbapi.com/")
    fun getList(
        @Query("apikey") apikey: String,
        @Query("s") s: String
    ): Call<BatmanList>


 @GET()
    fun getDetail(
        @Query("apikey") apikey: String,
        @Query("s") s: String
    ): Call<BatmanDetail>




}