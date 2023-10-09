package com.example.di

import android.app.Application

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        AppInjector.initialize(this)
        //ToastManager.getInstance(this)
    }
}