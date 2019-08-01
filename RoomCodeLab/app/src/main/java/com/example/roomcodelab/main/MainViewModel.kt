package com.example.roomcodelab.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.roomcodelab.database.GoldenJojo
import com.example.roomcodelab.database.GoldenJojoDao
import com.example.roomcodelab.database.GoldenJojoDatabase
import com.example.roomcodelab.database.GoldenJojoRepository
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repo : GoldenJojoRepository
    val allCharaters : LiveData<List<GoldenJojo>>

    init {
        val dao = GoldenJojoDatabase.getDatabase(application).goldenJojoDao
        repo = GoldenJojoRepository(dao)
        allCharaters = repo.allCharacters
    }


    fun insert(goldenJojo: GoldenJojo) = viewModelScope.launch {
        repo.insert(goldenJojo)
    }

    fun clearAll() = viewModelScope.launch {
        repo.clearAll()
    }
}