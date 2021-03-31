package com.ahaziq.simpledatabase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.room.Database
import androidx.room.Room

class MainActivity : AppCompatActivity() {



    @SuppressLint("LogConditional")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db = Room.databaseBuilder(applicationContext, ApplicationDatabase::class.java, "BookDB").allowMainThreadQueries().build()
        var bookEntity = DatabaseEntity()

        //bookEntity.bookId = 1

        val testAdd = findViewById<Button>(R.id.button2)
        testAdd.setOnClickListener{
            bookEntity.bookName = "Next App"
            db.databaseDao().saveBooks(bookEntity)
        }


    }

}
