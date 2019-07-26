package com.example.my8application.notif

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.my8application.MainActivity
import com.example.my8application.R

import java.util.Random

/**
 * Helper class to manage notification channels, and create notifications.
 */
@RequiresApi(Build.VERSION_CODES.O)
internal class NotificationHelper (context: Context) : ContextWrapper(context) {



    /**
     * Get the small icon for this app

     * @return The small icon resource id
     */
    private val smallIcon: Int
        get() = android.R.drawable.stat_notify_chat





    // Initialize the channel
    companion object {
        const val INSERT_CHANNEL = "insert"
    }




    // Initialize the notificationManager
    private val mNotificationManager: NotificationManager by lazy {
        getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
    }






    /**
     * Registers notification channels, which can be used later by individual notifications.
     */
    init {

        // Create the channel object with the unique ID INSERT_CHANNEL
        val followersChannel = NotificationChannel(
            INSERT_CHANNEL,
            getString(R.string.notification_channel_followers),
            NotificationManager.IMPORTANCE_DEFAULT)

        // Configure the channel's initial settings
        followersChannel.lightColor = Color.BLUE
        followersChannel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500, 400, 500, 200, 500)


        // Submit the notification channel object to the notification manager
        mNotificationManager.createNotificationChannel(followersChannel)

    }






    // get the insert notification
    fun getNotificationInsert(title: String, body: String): Notification.Builder {
        return Notification.Builder(applicationContext, INSERT_CHANNEL)
            .setContentTitle(title)
            .setContentText(body)
            .setSmallIcon(smallIcon)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
    }









    /**
     * Create a PendingIntent for opening up the MainActivity when the notification is pressed

     * @return A PendingIntent that opens the MainActivity
     */
     // The stack builder object will contain an artificial back stack for the
    // started Activity.
    // This ensures that navigating backward from the Activity leads out of
    // your application to the Home screen.
    // Adds the back stack for the Intent (but not the Intent itself)
    // Adds the Intent that starts the Activity to the top of the stack
    private val pendingIntent: PendingIntent
        get() {
            val openMainIntent = Intent(this, MainActivity::class.java)
            val stackBuilder = TaskStackBuilder.create(this)
            stackBuilder.addParentStack(MainActivity::class.java)
            stackBuilder.addNextIntent(openMainIntent)
            return stackBuilder.getPendingIntent(0, PendingIntent.FLAG_ONE_SHOT)
        }









    /**
     * Send a notification.
     *
     * @param id           The ID of the notification
     * *
     * @param notification The notification object
     */
    fun notify(id: Int, notification: Notification.Builder) {
        mNotificationManager.notify(id, notification.build())
    }


}
