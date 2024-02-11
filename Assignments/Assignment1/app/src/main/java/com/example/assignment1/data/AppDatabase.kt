package com.example.assignment1.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assignment1.model.UserEntity

@Database (
    version = 1,
    entities = [
        UserEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase {
            if(INSTANCE == null) {
                INSTANCE = Room.databaseBuilder (
                    context,
                    AppDatabase::class.java,
                    "user.db"
                ).fallbackToDestructiveMigration().build()
            }
            return INSTANCE as AppDatabase
        }
    }
}