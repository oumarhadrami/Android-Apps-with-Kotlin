package com.example.my8application


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationManagerCompat
import androidx.databinding.DataBindingUtil
import com.example.my8application.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private val notificationId: Int = 49744813
    private val textContent = "Insert the latest added characters coz they're great and very good!!"
    private val textTitle = "Insert characters"
    private val iNSERT_CHARACTERS_CHANNEL = "hadr_481"
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



    }






}
