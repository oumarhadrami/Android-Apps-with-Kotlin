package com.example.myapplication.screens.crazy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentCrazyBinding
import com.example.myapplication.screens.Main.MainViewModel


class CrazyFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentCrazyBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_crazy,container,false)



        return binding.root
    }


}
