package com.example.my8application.characters

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.my8application.database.OnePieceCharacter

@BindingAdapter("characterName")
fun TextView.setCharacterName(item : OnePieceCharacter?){
    item?.let {
        setText(item.characterName)
    }
}

@BindingAdapter("devilFruitType")
fun TextView.setDevilFruitType(item: OnePieceCharacter?){
    item?.let {
        setText(item.devilFruitType)
    }
}