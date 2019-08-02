package com.example.navigationcodelab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.navigationcodelab.databinding.FragmentStepOneBinding
import com.example.navigationcodelab.databinding.FragmentStepTwoBinding


class StepOneFragment : Fragment() {


    private lateinit var viewModel: SharedOneTwoViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentStepOneBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_step_one,container,false)
        viewModel = ViewModelProviders.of(this).get(SharedOneTwoViewModel::class.java)
        binding.viewmodel = viewModel
        // link databinding to livedata
        binding.lifecycleOwner = this


        binding.navNextStep.setOnClickListener {
            it.findNavController().navigate(StepOneFragmentDirections.actionStepOneFragmentToStepTwoFragment("Step 1 over!!"))
            viewModel.updateScore()
        }



        return binding.root
    }


}
