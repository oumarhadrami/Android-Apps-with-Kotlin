package com.example.roomcodelab.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "jojos")
data class GoldenJojo(

    @PrimaryKey(autoGenerate = true)
    val id : Long,

    @ColumnInfo(name = "character_name")
    val charName : String,

    @ColumnInfo(name = "stand_name")
    val standName : String,

    @ColumnInfo(name = "stand_type")
    val standType : String
    )