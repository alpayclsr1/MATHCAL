package com.example.proje1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.proje1.databinding.FragmentFragmentfourBinding


class fragmentfour : Fragment() {
lateinit var binding: FragmentFragmentfourBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view=inflater.inflate(R.layout.fragment_fragmentfour, container, false)
        val binding=FragmentFragmentfourBinding.inflate(layoutInflater)

        val signupp: Button =view.findViewById(R.id.signupp)
        //val context=this
        //var db=DataBaseHelper(context)
        binding.signupp.setOnClickListener {
            var namesurname=binding.enterusername.text.toString()
            if (namesurname.isNotEmpty()){
                var user=User(namesurname)
              //  db.insertData(user)

            }else{

            }
        }
        return view



    }





}