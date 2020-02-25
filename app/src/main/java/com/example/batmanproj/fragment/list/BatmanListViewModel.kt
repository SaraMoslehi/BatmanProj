package com.example.batmanproj.fragment.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.batmanproj.repo.BatmanListRepository

class BatmanListViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var batmanRepository: BatmanListRepository
//    private var batmanList: LiveData<List<BatmanListEntitiy>>

    init {

        batmanRepository =
            BatmanListRepository(application)
//        batmanList = batmanRepository.getBatmanList()
    }

//    fun getBatmanList(): LiveData<List<BatmanListEntitiy>> {
//        return batmanList
//    }

    fun getBatmanlists(apikey : String , s : String) {
        batmanRepository.getBatmanLists(apikey ,s)
    }
}
