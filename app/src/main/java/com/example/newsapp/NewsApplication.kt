package com.example.newsapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApplication : Application() {
    override fun onCreate() {
        Log.d("NewsApp", "OnCreate")
        super.onCreate()
    }
}
