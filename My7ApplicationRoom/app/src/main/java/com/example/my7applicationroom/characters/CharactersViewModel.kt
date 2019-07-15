package com.example.my7applicationroom.characters

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.my7applicationroom.database.OnePieceDatabaseDao

class CharactersViewModel(val database: OnePieceDatabaseDao,
                          application: Application) : AndroidViewModel(application) {


}