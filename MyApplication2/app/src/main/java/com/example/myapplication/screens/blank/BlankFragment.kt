package com.example.myapplication.screens.blank


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentBlankBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_blank, container, false)



        return binding.root
    }


}
