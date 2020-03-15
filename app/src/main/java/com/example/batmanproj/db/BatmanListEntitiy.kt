package com.example.batmanproj.db

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "BatmanList")
data class BatmanListEntitiy(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

//    @TypeConverters(SearchConverter::class)
//    @Embedded
//    private val search: List<test>? = null,

    @ColumnInfo(name = "totalResults")
    val totalResults: String? = null,
    @ColumnInfo(name = "Response")
    val response: String? = null


)