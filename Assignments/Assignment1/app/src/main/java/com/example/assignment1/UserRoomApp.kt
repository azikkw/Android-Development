package com.example.assignment1

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserRoomApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}