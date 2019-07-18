package com.example.my7applicationroom.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [OnePieceCharacter::class], version = 1, exportSchema = false)
abstract class OnePieceDatabase : RoomDatabase() {

    abstract val onePieceDatabaseDao : OnePieceDatabaseDao

    companion object{

        @Volatile
        private var INSTANCE: OnePieceDatabase? = null

        fun getInstance(context: Context) : OnePieceDatabase{
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        OnePieceDatabase::class.java,
                        "one_piece_characters"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}