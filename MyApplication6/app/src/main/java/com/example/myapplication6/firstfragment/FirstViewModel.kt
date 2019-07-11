package com.example.myapplication6.firstfragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {

    private var _score = MutableLiveData<Int>()
    val score : LiveData<Int>
    get() = _score


    override fun onCleared() {
        super.onCleared()

    }

    fun updateScore(){
        _score.value = (_score.value)?.plus(1)
    }
}