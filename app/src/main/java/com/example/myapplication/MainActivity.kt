package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.ui.main.DetailsFragment
import com.example.myapplication.ui.main.MoviesFragment
import com.example.myapplication.ui.main.SearchFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {

            supportFragmentManager.beginTransaction()
                    .replace(R.id.movies_container, SearchFragment.newInstance())
                    .commitNow()

        }
    }
}