package com.example.roomcodelab.database

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class GoldenJojoRepository(private val dao: GoldenJojoDao) {

    val allCharacters : LiveData<List<GoldenJojo>> = dao.getAll()
    val charWithSimilarStandTypes : LiveData<List<GoldenJojo>> = dao.getCharactersWithSimilarStandType("power")

    @WorkerThread
    suspend fun insert(goldenJojo: GoldenJojo){
        dao.insert(goldenJojo)
    }

    @WorkerThread
    suspend fun update(goldenJojo: GoldenJojo){
        dao.update(goldenJojo)
    }

    @WorkerThread
    suspend fun delete(goldenJojo: GoldenJojo){
        dao.delete(goldenJojo)
    }




}