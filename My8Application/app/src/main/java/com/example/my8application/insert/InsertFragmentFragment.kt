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
import com.example.my8application.database.OnePieceDatabase
import com.example.my8application.databinding.FragmentInsertBinding


class InsertFragmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding : FragmentInsertBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_insert, container,false)


        val application = requireNotNull(this.activity).application
        val dataSource = OnePieceDatabase.getInstance(application).onePieceDatabaseDao

        val viewModelFactory =
            InsertCharactersViewModelFactory(dataSource, application)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(InsertCharactersViewModel::class.java)

        binding.lifecycleOwner = this

        binding.button.setOnClickListener {
            val name = binding.textInputEditText4.text.toString()
            val devilFruitType = binding.textInputEditText3.text.toString()
            viewModel.insertCharacter(name,devilFruitType)
            it.findNavController().navigate(InsertFragmentFragmentDirections.actionInsertFragmentFragmentToCharactersFragment())
        }

        binding.goToCharacters.setOnClickListener {
            it.findNavController().navigate(InsertFragmentFragmentDirections.actionInsertFragmentFragmentToCharactersFragment())
        }

        return binding.root
    }


}
