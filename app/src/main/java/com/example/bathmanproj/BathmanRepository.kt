package com.example.bathmanproj

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import com.example.bathmanproj.api.ApiClient
import com.example.bathmanproj.db.BathmanListDao
import com.example.bathmanproj.db.BathmanListEntitiy
import com.example.bathmanproj.db.DbClient
import com.example.bathmanproj.model.BathmanDetail
import com.example.bathmanproj.model.BathmanList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BathmanRepository(application: Application) {

    private var bathmanDao: BathmanListDao
//    private var bathmanList: LiveData<List<BathmanListEntitiy>>
    private var dbClient: DbClient

    init {

        dbClient = DbClient.getDbClient(application)
        bathmanDao = dbClient.bathmanListDao()
//        bathmanList = bathmanDao.getBathmanList()

    }

//    fun getBathmanList(): LiveData<List<BathmanListEntitiy>> {
//        return bathmanList
//    }


    fun getBathmanLists(apikey : String , s : String){
        ApiClient.getService().getList(apikey ,s).enqueue(object : Callback<BathmanList?> {
            override fun onFailure(call: Call<BathmanList?>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(
                call: Call<BathmanList?>,
                response: Response<BathmanList?>
            ) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }


}