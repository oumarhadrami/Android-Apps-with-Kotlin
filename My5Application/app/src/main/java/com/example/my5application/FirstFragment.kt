package com.example.my5application


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.my5application.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentFirstBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_first, container, false)
        return binding.root

    }


}
