package com.example.batmanproj.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BatmanList(){
    @SerializedName("Search")
    @Expose
    private val search: List<Search>? = null
    @SerializedName("totalResults")
    @Expose
    private val totalResults: String? = null
    @SerializedName("Response")
    @Expose
    private val response: String? = null
}