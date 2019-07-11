package com.example.myapplication6.firstfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.myapplication6.firstfragment.FirstFragmentDirections
import com.example.myapplication6.R
import com.example.myapplication6.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    private lateinit var viewModel: FirstViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentFirstBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_first,container,false)

        binding.button.setOnClickListener {
            it.findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                    6
                )
            )
        }

        // reference to viewModel
        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)
        binding.viewmodel = viewModel

        viewModel.score.observe(this, Observer { newScore ->
            binding.score.text = newScore.toString()
        })

        return binding.root
    }


}
