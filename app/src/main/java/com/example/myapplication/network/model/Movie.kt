package com.example.myapplication.network.model

abstract class Movie {
    var popularity = 0
    var vote_count = 0
    var video = false
    var poster_path : String? = null
    var id = 0
    var adult = false
    var backdrop_path : String? = null
    var original_language = ""
    var original_title  = ""
    var genre_ids = ""
}