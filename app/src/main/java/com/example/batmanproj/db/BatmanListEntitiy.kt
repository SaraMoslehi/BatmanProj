package com.example.batmanproj.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "BatmanList")
data class BatmanListEntitiy(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,
//    @ColumnInfo(name = "Search")
//    private val search: List<Search>? = null,
    @ColumnInfo(name = "totalResults")
     val totalResults: String? = null,
    @ColumnInfo(name = "Response")
     val response: String? = null

)