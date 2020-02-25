package com.example.batmanproj

import android.app.Application
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.db.BatmanListDao
import com.example.batmanproj.db.DbClient
import com.example.batmanproj.model.BatmanList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BatmanRepository(application: Application) {

    private var batmanDao: BatmanListDao
//    private var batmanList: LiveData<List<BatmanListEntitiy>>
    private var dbClient: DbClient

    init {

        dbClient = DbClient.getDbClient(application)
        batmanDao = dbClient.batmanListDao()
//        batmanList = batmanDao.getBatmanList()

    }

//    fun getBatmanList(): LiveData<List<BatmanListEntitiy>> {
//        return batmanList
//    }


    fun getBatmanLists(apikey : String , s : String){
        ApiClient.getService().getList().enqueue(object : Callback<BatmanList?> {
            override fun onFailure(call: Call<BatmanList?>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(
                call: Call<BatmanList?>,
                response: Response<BatmanList?>
            ) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }


}