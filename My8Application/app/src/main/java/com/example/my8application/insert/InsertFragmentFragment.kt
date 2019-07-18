package com.example.my8application.insert


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.my8application.R
import com.example.my8application.databinding.FragmentInsertBinding


class InsertFragmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentInsertBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_insert, container,false)


        return binding.root
    }


}
