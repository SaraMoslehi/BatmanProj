package com.example.batmanproj.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {

    private var baseURL: String = "http://www.omdbapi.com/"
    var apiKey: String = "3e974fca"

    fun getClient(): OkHttpClient {


        val interceptor = HttpLoggingInterceptor()
            .setLevel(HttpLoggingInterceptor.Level.BODY)

        val builder = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(interceptor)


        return builder.build()
    }

    val getApiClient: Retrofit by lazy {
        synchronized(this) {

            val retrofit = Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getClient())
                .build()

            return@lazy retrofit
        }

    }

    fun getService(): ApiService {
        return getApiClient.create(ApiService::class.java)
    }

}