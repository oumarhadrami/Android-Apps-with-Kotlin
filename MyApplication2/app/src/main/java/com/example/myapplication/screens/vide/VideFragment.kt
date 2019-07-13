package com.example.myapplication.screens.vide


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentVideBinding


class VideFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val binding : FragmentVideBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_vide, container,false)

        return binding.root
    }


}
