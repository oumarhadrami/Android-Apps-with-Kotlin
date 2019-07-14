package com.example.myapplication.screens.blank

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel() {
    private lateinit var wordList: MutableList<String>

    // The current word
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    init {
        _score.value = 0
    }

    fun updateScore(){
        _score.value = (_score.value)?.plus(1)
    }
}