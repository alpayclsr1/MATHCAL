package com.example.proje1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.proje1.databinding.FragmentFragmenttwoBinding


class fragmenttwo:Fragment(){
    lateinit var databinding: FragmentFragmenttwoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_fragmenttwo, container, false)
        val signin: Button =view.findViewById(R.id.signin)
        val signup: Button =view.findViewById(R.id.signup)

        signup.setOnClickListener {
        findNavController().navigate(R.id.action_fragmenttwo_to_fragmentthree)
        }
        signin.setOnClickListener {


            activity?.let{
                val intent = Intent (it,MainActivity2 ::class.java)
                it.startActivity(intent)
            }
        }


        return view
    }

}

