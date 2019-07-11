package com.example.myapplication6.aboutfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.myapplication6.R
import com.example.myapplication6.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentAboutBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_about,container,false)
        return binding.root
    }


}
