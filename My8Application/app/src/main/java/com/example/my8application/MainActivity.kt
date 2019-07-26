package com.example.my8application


import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationManagerCompat
import androidx.databinding.DataBindingUtil
import com.example.my8application.databinding.ActivityMainBinding
import com.example.my8application.notif.NotificationHelper


class MainActivity : AppCompatActivity() {


    private val NOTIFICATION_INSERT = 1100
    private lateinit var mNotificationHelper: NotificationHelper


    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        mNotificationHelper = NotificationHelper(this)
        sendNotification(NOTIFICATION_INSERT)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun sendNotification(id: Int) {
        when (id) {
            NOTIFICATION_INSERT -> mNotificationHelper.notify(
                id, mNotificationHelper.getNotificationInsert(
                    getString(R.string.insert_title_notification),
                    getString(R.string.insert_body_notification)
                )
            )


        }
    }
}
