package com.example.myapplication.network.api

import com.example.myapplication.network.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET("search/movie")
    fun listMovies() :  Call<MovieResponse>
}