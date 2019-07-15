package com.example.my7applicationroom.characters


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.my7applicationroom.R
import com.example.my7applicationroom.databinding.FragmentCharactersBinding


class CharactersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentCharactersBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_characters, container, false)

        return binding.root
    }


}
