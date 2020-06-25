package com.example.myapplication.network.model

data class Movie(
    val popularity: String,
    val vote_count: Int,
    val adult: Boolean,
    val total_results : Int
)