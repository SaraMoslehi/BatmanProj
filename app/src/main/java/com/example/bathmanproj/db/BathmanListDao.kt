package com.example.bathmanproj.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query


@Dao
interface BathmanListDao {

    @Query("select * from BathmanList")
    fun getBathmanList(): LiveData<List<BathmanListEntitiy>>
//insert

}