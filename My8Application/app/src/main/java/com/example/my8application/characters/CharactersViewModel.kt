package com.example.my8application.characters

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.my8application.database.OnePieceCharacter
import com.example.my8application.database.OnePieceDatabaseDao
import kotlinx.coroutines.*

class CharactersViewModel(val database: OnePieceDatabaseDao,
                          application: Application
) : AndroidViewModel(application) {

    private var viewModelJob = Job()
    val characters = database.getAllCharacters()

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)




    fun clearAll(){
        uiScope.launch {
            clear()
        }
    }

    private suspend fun clear(){
        withContext(Dispatchers.IO){
            database.deleteAllCharacters()
        }
    }
}