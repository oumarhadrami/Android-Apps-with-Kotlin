package com.example.navigationcodelab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedOneTwoViewModel : ViewModel() {

    private var _score= MutableLiveData<Int>()
    val score : LiveData<Int>
    get() = _score


    init {
        _score.value = 0
    }


    fun updateScore(){
            _score.value = (_score.value)?.plus(1)
    }
}