package com.example.my8application.insert

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.my8application.database.OnePieceCharacter
import com.example.my8application.database.OnePieceDatabaseDao
import kotlinx.coroutines.*

class InsertCharactersViewModel(val database: OnePieceDatabaseDao,
                                application: Application
) : AndroidViewModel(application) {

    private var viewModelJob = Job()

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }



    private var uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)



    fun insertCharacter(name : String, devilFruitType : String){
        uiScope.launch {
            val newCharacter = OnePieceCharacter(characterName = name, devilFruitType = devilFruitType)
            insert(newCharacter)
        }
    }

    private suspend fun insert(character: OnePieceCharacter){
        withContext(Dispatchers.IO){
            database.insert(character)
        }
    }
}