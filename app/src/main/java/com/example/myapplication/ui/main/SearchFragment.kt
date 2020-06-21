package com.example.myapplication.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.myapplication.R

class SearchFragment : Fragment() {

    companion object {
        fun newInstance() = SearchFragment()
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.search_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        view?.findViewById<Button>(R.id.search_button)?.setOnClickListener {
            fragmentManager?.beginTransaction()
                ?.replace(R.id.details_container, DetailsFragment.newInstance())
                ?.commitNow()

            fragmentManager?.beginTransaction()
                ?.replace(R.id.movies_container, MoviesFragment.newInstance())
                ?.commitNow()


        }
    }

}