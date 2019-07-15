package com.example.my7applicationroom.insert


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.my7applicationroom.R
import com.example.my7applicationroom.database.OnePieceDatabase
import com.example.my7applicationroom.databinding.FragmentInsertBinding


class InsertFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val binding: FragmentInsertBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_insert, container,false)

        val application = requireNotNull(this.activity).application
        val dataSource = OnePieceDatabase.getInstance(application).onePieceDatabaseDao

        val viewModelFactory =
            InsertCharactersViewModelFactory(dataSource, application)

        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(InsertCharactersViewModel::class.java)

        binding.lifecycleOwner = this

        return binding.root
    }


}
