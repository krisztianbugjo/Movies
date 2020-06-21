package com.example.myapplication.controller

import com.example.myapplication.network.api.MovieApi
import com.example.myapplication.network.model.Movie
import com.example.myapplication.network.model.MovieResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.create


class MovieController {

    fun searchMovies(query: String) : Call<List<Movie>> {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3")
            .build()

        var movieApi : MovieApi = retrofit.create(MovieApi::class.java)


        movieApi.listMovies().enqueue(Call<MovieResponse>)
    }
}


}
