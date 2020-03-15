package com.example.batmanproj.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Search {
    @SerializedName("Title")
    @Expose
     val title: String? = null
    @SerializedName("Year")
    @Expose
     val year: String? = null
    @SerializedName("imdbID")
    @Expose
     val imdbID: String? = null
    @SerializedName("Type")
    @Expose
     val type: String? = null
    @SerializedName("Poster")
    @Expose
     val poster: String? = null
}