package com.example.myapplication.controller

import android.util.Log
import com.example.myapplication.network.ApiResponseListener
import com.example.myapplication.network.api.MovieApi
import com.example.myapplication.network.model.Movie
import com.example.myapplication.network.model.MovieResponse
import retrofit2.*


class MovieController {

    fun searchMovies(query: String, listener: ApiResponseListener<Movie>) {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3")
            .build()

        var movieApi: MovieApi = retrofit.create(MovieApi::class.java)

        //listener.onResponse()

        movieApi.listMovies().enqueue(object: Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, error: Throwable) {
                Log.e("MovieController", error.message)
            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                response.body()?.results?.let {
                    listener.onResponse(it)
                }


            }
        })

    }
}

