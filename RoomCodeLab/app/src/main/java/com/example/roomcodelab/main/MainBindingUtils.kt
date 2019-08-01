package com.example.roomcodelab.main

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.roomcodelab.database.GoldenJojo


@BindingAdapter("characterName")
fun TextView.setCharacterName(item : GoldenJojo?){
    item?.let {
        text = item.charName
    }
}


@BindingAdapter("standName")
fun TextView.setStandName(item : GoldenJojo?){
    item?.let {
        text = item.standName
    }
}


@BindingAdapter("standType")
fun TextView.setStandType(item : GoldenJojo?){
    item?.let {
        text = item.standType
    }
}