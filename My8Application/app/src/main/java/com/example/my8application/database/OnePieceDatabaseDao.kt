package com.example.my8application.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface OnePieceDatabaseDao {


    // insert a character
    @Insert
    fun insert(character: OnePieceCharacter)

    // update a character
    @Update
    fun update(character: OnePieceCharacter)

    //get back one specific character
    @Query("SELECT * FROM one_piece_characters WHERE characterId = :id")
    fun get(id : Long) : OnePieceCharacter?

    // delete all characters
    @Query("DELETE FROM one_piece_characters")
    fun deleteAllCharacters()

    // get back all characters as livedata
    @Query("SELECT * FROM one_piece_characters ORDER BY characterId DESC")
    fun getAllCharacters() : LiveData<List<OnePieceCharacter>>

    // get back the latest added character
    @Query("SELECT * FROM one_piece_characters ORDER BY characterId DESC LIMIT 1")
    fun getTheNewCharacter() : OnePieceCharacter?
}