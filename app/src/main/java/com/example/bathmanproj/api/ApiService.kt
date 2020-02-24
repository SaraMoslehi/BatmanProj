package com.example.bathmanproj.api

import com.example.bathmanproj.model.BathmanDetail
import com.example.bathmanproj.model.BathmanList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("http://www.omdbapi.com/")
    fun getList(
        @Query("apikey") apikey: String,
        @Query("s") s: String
    ): Call<BathmanList>


 @GET()
    fun getDetail(
        @Query("apikey") apikey: String,
        @Query("s") s: String
    ): Call<BathmanDetail>




}