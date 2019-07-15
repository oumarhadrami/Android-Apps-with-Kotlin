package com.example.my7applicationroom.insert

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.my7applicationroom.database.OnePieceDatabaseDao

class InsertCharactersViewModelFactory(
    private val dataSource: OnePieceDatabaseDao,
    private val application: Application) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InsertCharactersViewModel::class.java)) {
            return InsertCharactersViewModel(dataSource, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}