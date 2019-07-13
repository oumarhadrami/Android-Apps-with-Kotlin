package com.example.myapplication6.firstfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
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
        // link databinding to livedata
        binding.lifecycleOwner = this


        //observer for evenGameWon
        viewModel.eventGameWon.observe(this, Observer {hasWon ->
            if(hasWon) {
                findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(viewModel.score.value!!))
                viewModel.onGameFinish()
            }

        })


        return binding.root
    }


}
