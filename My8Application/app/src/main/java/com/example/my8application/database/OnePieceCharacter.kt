package com.example.my8application.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "one_piece_characters")
data class OnePieceCharacter(

    @PrimaryKey(autoGenerate = true)
    var characterId : Long = 0L,

    @ColumnInfo(name = "character_name")
    var characterName : String = "",

    @ColumnInfo(name = "devil_fruit_type")
    var devilFruitType : String = ""
)