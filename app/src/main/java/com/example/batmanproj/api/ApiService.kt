package com.example.batmanproj.api

import com.example.batmanproj.model.BatmanDetail
import com.example.batmanproj.model.BatmanList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("http://www.omdbapi.com/?apikey=3e974fca&s=batman")
    fun getList(

    ): Call<BatmanList>


 @GET()
    fun getDetail(
        @Query("apikey") apikey: String,
        @Query("s") s: String
    ): Call<BatmanDetail>




}