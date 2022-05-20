package com.example.proje1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Menufragment : Fragment() {

    private lateinit var rootview:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootview= inflater.inflate(R.layout.fragment_menufragment, container, false)
        findView()
        return rootview

    }
    private fun findView(){


    }

    private fun setlistener(){

    }


}