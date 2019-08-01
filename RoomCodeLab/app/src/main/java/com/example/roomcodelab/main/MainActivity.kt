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
        binding.lifecycleOwner =this



        val adapter = CharactersAdapter()
        binding.charactersList.adapter = adapter
        viewModel.allCharaters.observe(this, Observer {
            it?.let {
                adapter.submitList(it)
            }
        })

        binding.button3.setOnClickListener {
            val charName = binding.insertName.text.toString()
            val newCharacter = GoldenJojo(charName = charName)
            viewModel.insert(newCharacter)

        }



    }

}
