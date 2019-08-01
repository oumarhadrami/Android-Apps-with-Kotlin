package com.example.workmanagercodelab

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

class BlurWorker(context: Context, params: WorkerParameters) : CoroutineWorker(context,params) {

    override suspend fun doWork(): Result {
        return try {
            Result.success()
        } catch (error: Throwable) {
            Result.failure()
        }
    }
}