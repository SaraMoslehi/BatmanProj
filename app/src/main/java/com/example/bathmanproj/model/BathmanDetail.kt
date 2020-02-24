package com.example.bathmanproj.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class BathmanDetail {
    @SerializedName("Title")
    @Expose
    private var title: String? = null
    @SerializedName("Year")
    @Expose
    private var year: String? = null
    @SerializedName("Rated")
    @Expose
    private var rated: String? = null
    @SerializedName("Released")
    @Expose
    private var released: String? = null
    @SerializedName("Runtime")
    @Expose
    private var runtime: String? = null
    @SerializedName("Genre")
    @Expose
    private var genre: String? = null
    @SerializedName("Director")
    @Expose
    private var director: String? = null
    @SerializedName("Writer")
    @Expose
    private var writer: String? = null
    @SerializedName("Actors")
    @Expose
    private var actors: String? = null
    @SerializedName("Plot")
    @Expose
    private var plot: String? = null
    @SerializedName("Language")
    @Expose
    private var language: String? = null
    @SerializedName("Country")
    @Expose
    private var country: String? = null
    @SerializedName("Awards")
    @Expose
    private var awards: String? = null
    @SerializedName("Poster")
    @Expose
    private var poster: String? = null
    @SerializedName("Ratings")
    @Expose
    private var ratings: List<Rating?>? = null
    @SerializedName("Metascore")
    @Expose
    private var metascore: String? = null
    @SerializedName("imdbRating")
    @Expose
    private var imdbRating: String? = null
    @SerializedName("imdbVotes")
    @Expose
    private var imdbVotes: String? = null
    @SerializedName("imdbID")
    @Expose
    private var imdbID: String? = null
    @SerializedName("Type")
    @Expose
    private var type: String? = null
    @SerializedName("DVD")
    @Expose
    private var dVD: String? = null
    @SerializedName("BoxOffice")
    @Expose
    private var boxOffice: String? = null
    @SerializedName("Production")
    @Expose
    private var production: String? = null
    @SerializedName("Website")
    @Expose
    private var website: String? = null
    @SerializedName("Response")
    @Expose
    private var response: String? = null



}