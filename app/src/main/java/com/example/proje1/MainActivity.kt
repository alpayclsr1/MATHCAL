package com.example.proje1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import com.example.proje1.databinding.ActivityMainBinding
import android.Manifest
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat


lateinit var toggle: ActionBarDrawerToggle
class MainActivity : AppCompatActivity() {
    private lateinit var navcontroller:NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding:ActivityMainBinding

   // private lateinit var tvDatePicker: TextView
    //private lateinit var btnDatePicker:Button
    @SuppressLint("RestrictedApi")
    var REQUEST_CODE = 111
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       requestWindowFeature(Window.FEATURE_NO_TITLE);
       getSupportActionBar()?.hide();
       val binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)
       checkPermissions()
       //val context = this
       //var db = DataBaseHelper(context)

   }
       private fun checkPermissions() {
           if (ActivityCompat.checkSelfPermission(
                   this,Manifest.permission.CAMERA)
               != PackageManager.PERMISSION_GRANTED
               && ActivityCompat.checkSelfPermission(
                   this,Manifest.permission.READ_EXTERNAL_STORAGE)
               != PackageManager.PERMISSION_GRANTED
               && ActivityCompat.checkSelfPermission(
                   this,Manifest.permission.WRITE_EXTERNAL_STORAGE)
               != PackageManager.PERMISSION_GRANTED

           ){
               ActivityCompat.requestPermissions(
                   this, arrayOf(
                       Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE,
                       Manifest.permission.WRITE_EXTERNAL_STORAGE
                   ),REQUEST_CODE
               )

           }
       }

       override fun onRequestPermissionsResult(
           requestCode: Int,
           permissions: Array<out String>,
           grantResults: IntArray
       ) {
           super.onRequestPermissionsResult(requestCode, permissions, grantResults)
           if (
               requestCode == REQUEST_CODE
               && grantResults[0]== PackageManager.PERMISSION_GRANTED
               && grantResults[1]== PackageManager.PERMISSION_GRANTED
               && grantResults[2]== PackageManager.PERMISSION_GRANTED
           ){
               Toast.makeText(this,"All Permission Granted",Toast.LENGTH_SHORT).show()
           }
















   }



}