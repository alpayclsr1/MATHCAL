package com.example.proje1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class fragmenttwo:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_fragmenttwo, container, false)
        val signup: Button =view.findViewById(R.id.signup)
        signup.setOnClickListener {
        findNavController().navigate(R.id.action_fragmenttwo_to_fragmentthree)
        }


        return view
    }

}

