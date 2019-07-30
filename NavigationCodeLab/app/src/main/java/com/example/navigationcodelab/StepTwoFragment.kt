package com.example.navigationcodelab


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcodelab.databinding.FragmentStepTwoBinding


class StepTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentStepTwoBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_step_two,container,false)

        binding.finishFlow.setOnClickListener {
            it.findNavController().navigate(StepTwoFragmentDirections.actionStepTwoFragmentToHomeFragment())
        }


        val args = StepTwoFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context, args.finishMessage, Toast.LENGTH_SHORT).show()

        return binding.root
    }


}
