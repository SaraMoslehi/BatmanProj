package com.example.batmanproj.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface BatmanListDao {

    @Query("select * from BatmanList")
    fun getBatmanList(): LiveData<List<BatmanListEntitiy>>

    //insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBatman(batmanListEntitiy: BatmanListEntitiy)

}