package com.example.myapplication.screens.empty


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentEmptyBinding


class EmptyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentEmptyBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_empty, container, false)

        binding.button.setOnClickListener {
            it.findNavController().navigate(EmptyFragmentDirections.actionEmptyFragmentToVideFragment())
        }
        return binding.root
    }


}
