package com.example.bathmanproj

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.bathmanproj.db.BathmanListEntitiy
import com.example.bathmanproj.model.BathmanDetail

class BathmanListViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel
    private var bathmanRepository: BathmanRepository
//    private var bathmanList: LiveData<List<BathmanListEntitiy>>

    init {

        bathmanRepository = BathmanRepository(application)
//        bathmanList = bathmanRepository.getBathmanList()
    }

//    fun getBAthmanList(): LiveData<List<BathmanListEntitiy>> {
//        return bathmanList
//    }

    fun getBathmanlists(apikey : String , s : String) {
        bathmanRepository.getBathmanLists(apikey ,s)
    }
}
