package com.example.roomcodelab.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [GoldenJojo::class], version = 1, exportSchema = false)
abstract class GoldenJojoDatabase : RoomDatabase(){

    abstract val goldenJojoDao : GoldenJojoDao

    companion object{

        @Volatile
        private var INSTANCE : GoldenJojoDatabase? = null

        fun getDatabase(context: Context) : GoldenJojoDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context.applicationContext,
                    GoldenJojoDatabase::class.java,
                    "golden_jojos_database")
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}