package com.example.batmanproj.db

import androidx.room.TypeConverter
import com.example.batmanproj.model.Search
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SearchConverter {

    @TypeConverter
    fun fromCountryLangList(value: List<Search>): String {
        val gson = Gson()
        val type = object : TypeToken<List<Search>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toCountryLangList(value: String): List<Search> {
        val gson = Gson()
        val type = object : TypeToken<List<Search>>() {}.type
        return gson.fromJson(value, type)
    }
}