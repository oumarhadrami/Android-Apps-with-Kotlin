package com.example.my7applicationroom.characters

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.Transformations
import com.example.my7applicationroom.ConvertToStrings
import com.example.my7applicationroom.database.OnePieceDatabaseDao
import kotlinx.coroutines.*

class CharactersViewModel(val database: OnePieceDatabaseDao,
                          application: Application
) : AndroidViewModel(application) {

    private var viewModelJob = Job()

    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }

    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    private val characters = database.getAllCharacters()

    /*val charactersString = Transformations.map(characters) { characters ->
        ConvertToStrings(characters, application.resources)
    }!!
*/
    val charactersL = characters.toString()



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