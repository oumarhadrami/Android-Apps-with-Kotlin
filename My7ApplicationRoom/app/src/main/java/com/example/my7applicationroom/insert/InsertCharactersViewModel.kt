package com.example.my7applicationroom.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.my7applicationroom.database.OnePieceCharacter
import com.example.my7applicationroom.database.OnePieceDatabaseDao
import kotlinx.coroutines.*

class InsertCharactersViewModel(val database: OnePieceDatabaseDao,
                                application: Application) : AndroidViewModel(application) {

    private var viewModelJob = Job()

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }



    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private var character = MutableLiveData<OnePieceCharacter?>()

    fun insertCharacter(){
        uiScope.launch {
            val newCharacter = OnePieceCharacter()
            insert(newCharacter)
        }
    }

    private suspend fun insert(character: OnePieceCharacter){
        withContext(Dispatchers.IO){
            database.insert(character)
        }
    }
}