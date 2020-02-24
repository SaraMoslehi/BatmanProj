package com.example.bathmanproj.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.bathmanproj.model.Rating

@Entity(tableName = "BathmanList")
class BathmanListEntitiy(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "Title")

    var title: String? = null,
    @ColumnInfo(name = "Year")

    var year: String? = null,
    @ColumnInfo(name = "Rated")

    var rated: String? = null,
    @ColumnInfo(name = "Released")

    var released: String? = null,
    @ColumnInfo(name = "Runtime")

    var runtime: String? = null,
    @ColumnInfo(name = "Genre")

    var genre: String? = null,
    @ColumnInfo(name = "Director")

    var director: String? = null,
    @ColumnInfo(name = "Writer")

    var writer: String? = null,
    @ColumnInfo(name = "Actors")

    var actors: String? = null,
    @ColumnInfo(name = "Plot")

    var plot: String? = null,
    @ColumnInfo(name = "Language")

    var language: String? = null,
    @ColumnInfo(name = "Country")

    var country: String? = null,
    @ColumnInfo(name = "Awards")

    var awards: String? = null,
    @ColumnInfo(name = "Poster")

    var poster: String? = null,
//    @ColumnInfo(name = "Ratings")

//    var ratings: List<String?>? = null,
    @ColumnInfo(name = "Metascore")

    var metascore: String? = null,
    @ColumnInfo(name = "imdbRating")

    var imdbRating: String? = null,
    @ColumnInfo(name = "imdbVotes")

    var imdbVotes: String? = null,
    @ColumnInfo(name = "imdbID")

    var imdbID: String? = null,
    @ColumnInfo(name = "Type")

    var type: String? = null,
    @ColumnInfo(name = "DVD")

    var dVD: String? = null,
    @ColumnInfo(name = "BoxOffice")

    var boxOffice: String? = null,
    @ColumnInfo(name = "Production")

    var production: String? = null,
    @ColumnInfo(name = "Website")

    var website: String? = null,
    @ColumnInfo(name = "Response")

    var response: String? = null


)