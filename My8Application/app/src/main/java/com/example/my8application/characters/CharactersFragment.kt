package com.example.my8application.characters


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import com.example.my8application.R
import com.example.my8application.database.OnePieceDatabase
import com.example.my8application.databinding.FragmentCharactersBinding


class CharactersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentCharactersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_characters, container,false)


        val application = requireNotNull(this.activity).application
        val dataSource = OnePieceDatabase.getInstance(application).onePieceDatabaseDao

        val viewModelFactory =
            CharactersViewModelFactory(dataSource, application)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(CharactersViewModel::class.java)

        binding.viewmodel = viewModel

        binding.lifecycleOwner =this




        binding.inserttt.setOnClickListener {
            it.findNavController().navigate(CharactersFragmentDirections.actionCharactersFragmentToInsertFragmentFragment())
        }

        return binding.root
    }


}