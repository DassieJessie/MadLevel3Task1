package com.example.gameratingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//The summary screen needs to know what game was rated and what the rating itself was.
const val ARG_GAME_NAME = "arg_game_name"
const val ARG_GAME_RATING = "arg_game_rating"

class SummaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_summary, container, false)
    }

}