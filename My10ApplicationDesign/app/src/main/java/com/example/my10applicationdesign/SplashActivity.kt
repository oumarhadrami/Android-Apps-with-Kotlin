package com.example.my10applicationdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.my10applicationdesign.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)


        thread {
            Thread.sleep((3 * 1000).toLong())
            startMainActivity()
        }.priority = Thread.NORM_PRIORITY
    }


    private fun startMainActivity() {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}