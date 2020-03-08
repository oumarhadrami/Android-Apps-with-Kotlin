package com.example.roomcodelab.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roomcodelab.R
import com.example.roomcodelab.database.GoldenJojo
import com.example.roomcodelab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val application = requireNotNull(this).application
        val viewModelFactory = MainViewModelFactory(application)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        binding.viewmodel = viewModel


        // recyclerview adapter init
        val adapter = CharactersAdapter()
        binding.charactersList.adapter = adapter
        viewModel.allCharaters.observe(this, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        // Insert a new character
        binding.insert.setOnClickListener {
            val charName = binding.insertName.text.toString()
            val newCharacter = GoldenJojo(charName = charName)
            viewModel.insert(newCharacter)

        }


        //Update an existing character with id 4
        binding.update.setOnClickListener {
            val charName = binding.insertName.text.toString()
            val newCharacter = GoldenJojo(id = 2, charName = charName)
            viewModel.update(newCharacter)
        }


        // clear the database
        binding.clear.setOnClickListener {
            viewModel.clearAll()
        }
    }
}
