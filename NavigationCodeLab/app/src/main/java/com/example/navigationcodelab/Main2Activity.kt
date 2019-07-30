package com.example.navigationcodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.navigationcodelab.databinding.ActivityMain2Binding
import com.example.navigationcodelab.databinding.ActivityMainBinding

class Main2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)
    }
}
