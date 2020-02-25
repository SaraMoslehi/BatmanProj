package com.example.batmanproj.fragment.detail

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class BatmanDetailViewModel(application: Application) : AndroidViewModel(application) {

    var batmanDetailRepository: BatmanDetailRepository

    init {

        batmanDetailRepository = BatmanDetailRepository(application)

    }

    fun getBatmanDetail(apiKey: String, i: String) {
        batmanDetailRepository.getBatmanDetail(apiKey, i)
    }

}
