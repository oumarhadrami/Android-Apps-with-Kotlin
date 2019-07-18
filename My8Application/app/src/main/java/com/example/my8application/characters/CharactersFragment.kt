package com.example.my8application.characters


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.my8application.R
import com.example.my8application.databinding.FragmentCharactersBinding
import com.example.my8application.databinding.FragmentInsertBinding


class CharactersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentCharactersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_characters, container,false)
        return binding.root
    }


}
