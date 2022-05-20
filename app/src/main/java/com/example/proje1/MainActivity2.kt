package com.example.proje1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import android.text.Layout as Layout1

class MainActivity2 : AppCompatActivity() {
    private lateinit var drawerLayout:DrawerLayout
    private lateinit var buttonmenu:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findView()
        setlistener()
    }

    private fun findView() {
        drawerLayout=findViewById(R.id.drawerLayout)
        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        buttonmenu=findViewById(R.id.buttonmenu)

    }
    private fun setlistener(){
        buttonmenu.setOnClickListener{
        showmenu()
        }
    }
    private fun showmenu(){

        drawerLayout.openDrawer(GravityCompat.START)
    }
}