package com.example.batmanproj.db

import androidx.room.*
import com.example.batmanproj.model.Search

@Entity(tableName = "BatmanList")
data class BatmanListEntitiy(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @TypeConverters(SearchConverter::class)
    val search: List<Search>? =null,

    @ColumnInfo(name = "totalResults")
    val totalResults: String? = null,
    @ColumnInfo(name = "Response")
    val response: String? = null


)
