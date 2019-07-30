package com.example.navigationcodelab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.navigationcodelab.databinding.FragmentStepTwoBinding


class StepTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentStepTwoBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_step_two,container,false)
        return binding.root
    }


}
