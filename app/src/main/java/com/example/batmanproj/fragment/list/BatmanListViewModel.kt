package com.example.batmanproj.fragment.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.batmanproj.db.MovieEntity

class BatmanListViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var batmanRepository: BatmanListRepository = BatmanListRepository(application)
    //    private var batmanList: LiveData<List<BatmanListEntitiy>>
    private var allMovies: LiveData<List<MovieEntity>>

    init {

        allMovies = batmanRepository.getAllMovie()
        //        batmanList = batmanRepository.getBatmanList()
    }


    fun getAllMovie(): LiveData<List<MovieEntity>> {
        return allMovies
    }


//    fun getBatmanList(): LiveData<List<BatmanListEntitiy>> {
//        return batmanList
//    }

    fun getBatmanlists(apikey: String, s: String) {
        batmanRepository.getBatmanLists(apikey, s)
    }
}
