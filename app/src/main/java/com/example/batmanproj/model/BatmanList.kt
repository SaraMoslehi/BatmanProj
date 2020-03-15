package com.example.batmanproj.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BatmanList(){
    @SerializedName("Search")
    @Expose
     val search: List<Search>? = null
    @SerializedName("totalResults")
    @Expose
     val totalResults: String? = null
    @SerializedName("Response")
    @Expose
     val response: String? = null
}