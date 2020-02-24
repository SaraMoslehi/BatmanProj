package com.example.bathmanproj.api

import retrofit2.http.GET

interface ApiService {

    @GET("?apikey")
    fun getList()
}