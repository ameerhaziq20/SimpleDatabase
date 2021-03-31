package com.ahaziq.simpledatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao
{
    @Insert
    fun saveBooks(book: DatabaseEntity)

    @Query(value = "Select * from DatabaseEntity")
    fun getAllBooks() : List<DatabaseEntity>
}