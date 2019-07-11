package com.example.myapplication6.secondfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication6.R
import com.example.myapplication6.SecondFragmentArgs
import com.example.myapplication6.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentSecondBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_second,container,false)

        getArgs()

        return binding.root
    }

    private fun getArgs() {
        val args = SecondFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"The number received was ${args.number}",Toast.LENGTH_SHORT).show()
    }


}
