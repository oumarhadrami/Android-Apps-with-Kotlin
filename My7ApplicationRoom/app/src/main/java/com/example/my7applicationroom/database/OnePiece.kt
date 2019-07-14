package com.example.my7applicationroom.database

import androidx.room.Entity

@Entity(tableName = "one_piece_characters")
data class OnePiece(
    var characterId : Long = 0L,
    var characterName : String = "",
    var devilFruitType : String = ""
)