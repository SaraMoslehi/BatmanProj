package com.example.bathmanproj.model

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class Search {
    @SerializedName("Title")
    @Expose
    private val title: String? = null
    @SerializedName("Year")
    @Expose
    private val year: String? = null
    @SerializedName("imdbID")
    @Expose
    private val imdbID: String? = null
    @SerializedName("Type")
    @Expose
    private val type: String? = null
    @SerializedName("Poster")
    @Expose
    private val poster: String? = null
}