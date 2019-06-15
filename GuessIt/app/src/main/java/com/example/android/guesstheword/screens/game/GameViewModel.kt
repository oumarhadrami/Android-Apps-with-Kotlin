package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.i("GameVIewModel","GameViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameVIewModel","GameViewModel Destroyed")

    }
}