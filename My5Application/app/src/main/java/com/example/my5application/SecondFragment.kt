package com.example.my5application


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.my5application.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding : FragmentSecondBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_second,
            container,false)

        var args = SecondFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context, args.message,Toast.LENGTH_LONG).show()

        return binding.root
    }


}
