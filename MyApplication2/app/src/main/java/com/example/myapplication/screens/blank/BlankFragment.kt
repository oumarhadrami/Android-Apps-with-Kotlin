package com.example.myapplication.screens.blank


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentBlankBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_blank, container, false)


        binding.button.setOnClickListener {
            it.findNavController().navigate(BlankFragmentDirections.actionBlankFragmentToEmptyFragment(true))
        }
        return binding.root
    }


}
