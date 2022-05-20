package com.example.proje1

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

val database_name="MyDataBase"
val table_name="Users"
val col_name="Name_Surname"


class DataBaseHelper (var context:Context):SQLiteOpenHelper(context,
database_name,null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        var createTable=" CREATE TABLE"+ table_name+"("+
                col_name +" VARCHAR(256)"

        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    //veri kaydi fonksiyonu

    fun insertData(user: User){

        val db=this.writableDatabase
        val cv=ContentValues()
        cv.put(col_name,user.namesurname)
        var sonuc=db.insert(table_name,null,cv)
        if (sonuc==(-1).toLong()){

            Toast.makeText(context,"Error",Toast.LENGTH_LONG).show()


        }else{

            Toast.makeText(context,"Accomplished",Toast.LENGTH_LONG).show()
        }


    }
}



