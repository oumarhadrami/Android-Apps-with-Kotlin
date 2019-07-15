package com.example.my7applicationroom.database

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
    @Query("SELECT * FROM one_piece_characters where characterId = :id")
    fun get(id : Long) : OnePieceCharacter?

    // delete all characters
    @Query("delete from one_piece_characters")
    fun deleteAllCharacters()

    // get back all characters as livedata
    @Query("select * from one_piece_characters order by characterId desc")
    fun getAllCharacters() : LiveData<List<OnePieceCharacter>>

    // get back the latest added character
    @Query("select * from one_piece_characters order by characterId desc limit 1")
    fun getTheNewCharacter() : OnePieceCharacter?
}