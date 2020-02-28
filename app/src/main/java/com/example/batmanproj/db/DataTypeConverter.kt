package com.example.batmanproj.db

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*


object DataTypeConverter {
    private val gson = Gson()
    @TypeConverter
    fun stringToList(data: String?): List<String>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type =
            object : TypeToken<List<String>?>() {}.type
        return gson.fromJson<List<String>>(data, listType)
    }

    @TypeConverter
    fun ListToString(someObjects: List<String>?): String? {
        return gson.toJson(someObjects)
    }
}