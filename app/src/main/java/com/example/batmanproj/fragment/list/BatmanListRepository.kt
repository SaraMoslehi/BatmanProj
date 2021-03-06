package com.example.batmanproj.fragment.list

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.batmanproj.api.ApiClient
import com.example.batmanproj.db.BatmanListDao
import com.example.batmanproj.db.DbClient
import com.example.batmanproj.db.MovieDao
import com.example.batmanproj.db.MovieEntity
import com.example.batmanproj.model.BatmanList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BatmanListRepository(application: Application) {

    private var batmanDao: BatmanListDao
    //    private var batmanList: LiveData<List<BatmanListEntitiy>>
    private var dbClient: DbClient = DbClient.getDbClient(application)
    private var allMovies: LiveData<List<MovieEntity>>

    private var movieDao: MovieDao

    init {

        batmanDao = dbClient.batmanListDao()
//        batmanList = batmanDao.getBatmanList()
        movieDao = dbClient.movieDao()

        allMovies = movieDao.getAllMovies()

    }

    fun getAllMovie(): LiveData<List<MovieEntity>> {
        return allMovies
    }


//    fun getBatmanList(): LiveData<List<BatmanListEntitiy>> {
//        return batmanList
//    }


    fun getBatmanLists(apikey: String, s: String) {
        ApiClient.getService().getList(apikey, s).enqueue(object : Callback<BatmanList?> {
            override fun onFailure(call: Call<BatmanList?>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<BatmanList?>, response: Response<BatmanList?>
            ) {
                var batmanList: BatmanList = response.body()!!

                DbClient.executorsService.execute(Runnable {
                    for (item in batmanList.search!!) {
                        movieDao.insertMovies(
                            MovieEntity(
                                0,
                                item.title,
                                item.year,
                                item.imdbID,
                                item.type,
                                item.poster
                            )
                        )
                    }

                })


            }
        })
    }


}