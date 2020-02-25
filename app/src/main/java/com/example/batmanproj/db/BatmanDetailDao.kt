package com.example.batmanproj.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface BatmanDetailDao {

    @Query("select * from BatmanDetail")
    fun getBatmanDetail(): LiveData<List<BatmanDetailEntitiy>>
//insert

}