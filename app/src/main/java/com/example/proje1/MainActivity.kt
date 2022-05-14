package com.example.proje1

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var navcontroller:NavController

   // private lateinit var tvDatePicker: TextView
    //private lateinit var btnDatePicker:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar()?.hide();
        setContentView(R.layout.activity_main)
        //tvDatePicker=findViewById(R.id.hour)
       // btnDatePicker=findViewById(R.id.button2)

       // val mycalendar =Calendar.getInstance()

      //  val datePicker=DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
           // mycalendar.set(Calendar.YEAR, year)
           // mycalendar.set(Calendar.MONTH, month)
          //  mycalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
           // updatelable(mycalendar)
       // }
        //btnDatePicker.setOnClickListener{
          //  DatePickerDialog(this,datePicker,mycalendar.get(Calendar.YEAR),mycalendar.get(Calendar.MONTH),
            //mycalendar.get(Calendar.DAY_OF_MONTH)).show()
        //}



        //val navHostFragment=supportFragmentManager
           // .findFragmentById(R.id.fragmenttwo) as NavHostFragment
        //navcontroller=navHostFragment.navController
    }

    //private fun updatelable(mycalendar: Calendar) {
     //   val myFormat="dd-MM-yyyy"
       // val sdf=SimpleDateFormat(myFormat,Locale.ENGLISH)
       // tvDatePicker.setText(sdf.format(mycalendar.time))

   // }
}