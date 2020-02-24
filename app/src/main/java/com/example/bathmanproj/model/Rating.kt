package com.example.bathmanproj.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Rating {
    @SerializedName("Source")
    @Expose
    private val source: String? = null
    @SerializedName("Value")
    @Expose
    private val value: String? = null
}