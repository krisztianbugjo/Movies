package com.example.myapplication.network

import com.example.myapplication.network.model.Movie

interface ApiResponseListener<Movie> {
    fun onResponse(list: List<Movie>)
}