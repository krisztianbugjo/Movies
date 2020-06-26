package com.example.myapplication.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.myapplication.R
import com.example.myapplication.controller.MovieController
import com.example.myapplication.network.ApiResponseListener
import com.example.myapplication.network.model.Movie
import kotlinx.android.synthetic.main.movies_fragment.*
import kotlinx.android.synthetic.main.search_fragment.*

class MoviesFragment : Fragment() {

    lateinit var movieController : MovieController


    fun fillMovieList() {
        movieController.searchMovies(searchField.text.toString(), object: ApiResponseListener<Movie> {
            override fun onResponse(list: List<Movie>) {

            }
        })
    }

    companion object {
        fun newInstance() = MoviesFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.movies_fragment, container, false)



    }

    override fun onStart() {
        super.onStart()
        //fillMovieList()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}