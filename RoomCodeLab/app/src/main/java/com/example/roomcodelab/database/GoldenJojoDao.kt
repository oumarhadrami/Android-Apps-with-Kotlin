package com.example.roomcodelab.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GoldenJojoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(goldenJojo: GoldenJojo)

    @Update
    suspend fun update(goldenJojo: GoldenJojo)

    @Delete
    suspend fun delete(goldenJojo: GoldenJojo)

    @Query("delete from jojos")
    fun clearAll()

    @Query("select * from jojos order by character_name desc")
    fun getAll(): LiveData<List<GoldenJojo>>

    @Query("select * from jojos where character_name like :search")
    fun getCharactersWithSimilarNames(search : String) : LiveData<List<GoldenJojo>>
}