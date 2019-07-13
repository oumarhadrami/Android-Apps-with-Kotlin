package com.example.myapplication.screens.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    enum class IsCrazy {
        CRAZY,
        NOT_CRAZY
    }
    val mentalState = MutableLiveData<IsCrazy>()

    init {
        mentalState.value = IsCrazy.CRAZY
    }

    fun seeIfCrazy(){
        if(true){
            mentalState.value = IsCrazy.CRAZY
        }
        else{
            mentalState.value = IsCrazy.NOT_CRAZY
        }
    }
}