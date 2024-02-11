package com.example.assignment2

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserRoomApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}