package com.example.batmanproj.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface BatmanListDao {

    @Query("select * from BatmanList")
    fun getBatmanList(): LiveData<List<BatmanListEntitiy>>
//insert

}