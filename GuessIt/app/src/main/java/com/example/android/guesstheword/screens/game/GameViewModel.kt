package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    // The current word
    private val _word = MutableLiveData<String>()
    val word: LiveData<String>
    get() = _word

    // The current score
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
    get() = _score

    // Game Finished Event
    private val _gameFinishedEvent = MutableLiveData<Boolean>()
    val gameFinishedEvent : LiveData<Boolean>
    get() = _gameFinishedEvent

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>

    // Init Block
    init {
        Log.i("GameVIewModel","GameViewModel Created")
        _gameFinishedEvent.value = false
        _score.value = 0
        _word.value = ""
        resetList()
        nextWord()
    }

    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()

    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameVIewModel","GameViewModel Destroyed")

    }

    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            //gameFinished()
            _gameFinishedEvent.value = true
        } else {
            _word.value = wordList.removeAt(0)
        }
    }

    /** Methods for buttons presses **/

    fun onSkip() {
        _score.value = (score.value)?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        _score.value = (score.value)?.plus(1)
        nextWord()
    }

    fun onGameFinishedCOmplete(){
        _gameFinishedEvent.value = false
    }
}