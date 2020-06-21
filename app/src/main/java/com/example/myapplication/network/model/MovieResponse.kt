package com.example.myapplication.network.model

import java.util.ArrayList

class MovieResponse {

    var page = 0

    var totalResults = 0

    var totalPages = 0

    var results: List<Movie>? = ArrayList<Movie>()
}
