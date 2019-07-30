package com.example.navigationcodelab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcodelab.databinding.FragmentHomeBinding
import com.example.navigationcodelab.databinding.FragmentStepTwoBinding


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)

        binding.textView.setOnClickListener{
           it.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToMain2Activity())
        }


        return binding.root
    }


}
