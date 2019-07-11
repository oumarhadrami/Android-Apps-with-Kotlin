package com.example.myapplication6.firstfragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {

    private var _score = MutableLiveData<Int>()
    val score : LiveData<Int>
    get() = _score
    //Add MapTransformation to livedata score to make it string
    val scoreString = Transformations.map(score, {score ->
        score.toString()
    })

    init {
        _score.value = 0
    }

    override fun onCleared() {
        super.onCleared()

    }

    fun updateScore(){
        _score.value = (_score.value)?.plus(1)
    }
}