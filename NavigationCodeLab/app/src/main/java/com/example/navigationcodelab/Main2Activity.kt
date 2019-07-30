package com.example.navigationcodelab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.navigationcodelab.databinding.ActivityMain2Binding
import com.example.navigationcodelab.databinding.ActivityMainBinding

class Main2Activity : AppCompatActivity() {

    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)


        val intent : Intent = getIntent()
        val isLoggedIn : Boolean = intent.getBooleanExtra("isLoggedIn",true)
        Toast.makeText(this, "$isLoggedIn", Toast.LENGTH_SHORT).show()
    }
}
