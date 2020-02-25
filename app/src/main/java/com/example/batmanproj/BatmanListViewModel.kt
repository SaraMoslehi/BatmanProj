package com.example.batmanproj

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class BatmanListViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var batmanRepository: BatmanRepository
//    private var batmanList: LiveData<List<BatmanListEntitiy>>

    init {

        batmanRepository = BatmanRepository(application)
//        batmanList = batmanRepository.getBatmanList()
    }

//    fun getBatmanList(): LiveData<List<BatmanListEntitiy>> {
//        return batmanList
//    }

    fun getBatmanlists(apikey : String , s : String) {
        batmanRepository.getBatmanLists(apikey ,s)
    }
}
