package com.ahaziq.simpledatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class DatabaseEntity {

    @PrimaryKey(autoGenerate = true)
    var bookId: Int =0

    @ColumnInfo(name ="Student ID")
    var bookName:  String =""

}