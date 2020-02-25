package com.example.batmanproj.fragment.detail

import android.app.Application
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.db.BatmanDetailDao
import com.example.batmanproj.db.DbClient
import com.example.batmanproj.model.BatmanDetail
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BatmanDetailRepository(application: Application) {

    private var batmanDetailDao: BatmanDetailDao

    private var dbClient: DbClient

    init {
        dbClient = DbClient.getDbClient(application)
        batmanDetailDao = dbClient.batmanDetailDao()
    }

    fun getBatmanDetail(apiKey: String, i: String) {
        ApiClient.getService().getDetail(apiKey, i).enqueue(object : Callback<BatmanDetail?> {
            override fun onFailure(call: Call<BatmanDetail?>, t: Throwable) {
            }

            override fun onResponse(call: Call<BatmanDetail?>, response: Response<BatmanDetail?>) {
            }
        })
    }

}