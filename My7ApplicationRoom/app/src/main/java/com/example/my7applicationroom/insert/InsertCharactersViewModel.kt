package com.example.my7applicationroom.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.my7applicationroom.database.OnePieceDatabaseDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class InsertCharactersViewModel(val database: OnePieceDatabaseDao,
                                application: Application) : AndroidViewModel(application) {

    private var viewModelJob = Job()

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)
}