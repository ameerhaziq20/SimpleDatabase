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

        //test for adding static data to database
        val testAddID = findViewById<Button>(R.id.btnAddID)
        testAddID.setOnClickListener{
            bookEntity.bookName = "171020887"
            db.databaseDao().saveBooks(bookEntity)
        }

        //test for clearing all data in database
        val testDeleteID = findViewById<Button>(R.id.btnDeleteAllID)
        testDeleteID.setOnClickListener{
            db.databaseDao().deleteAll()
        }
        val testAddTemp = findViewById<Button>(R.id.btnAddTemp)
        testAddTemp.setOnClickListener{
            bookEntity.bodyTemp = "36.0"
            db.databaseDao().saveBooks(bookEntity)
        }



    }

}
