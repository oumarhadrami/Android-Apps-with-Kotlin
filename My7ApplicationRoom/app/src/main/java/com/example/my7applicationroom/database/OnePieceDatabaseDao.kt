package com.example.my7applicationroom.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface OnePieceDatabaseDao {


    // insert a character
    @Insert
    fun insert(character: OnePiece)

    // update a character
    @Update
    fun update(character: OnePiece)

    //get back one character
    @Query("SELECT * FROM one_piece_characters where characterId = :id")
    fun get(id : Long) : OnePiece

    // delete all characters
    @Query("delete from one_piece_characters")
    fun deleteAllCharacters()

    // get back all characters as livedata
    @Query("select * from one_piece_characters order by characterId desc")
    fun getAllCharacters() : LiveData<List<OnePiece>>
}