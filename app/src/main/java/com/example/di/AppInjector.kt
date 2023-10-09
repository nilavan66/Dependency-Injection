package com.example.di

import android.content.Context

class AppInjector private constructor(){


    companion object {
        private lateinit var toastManager: ToastManager

        fun initialize(context: Context) {
            toastManager = ToastManager(context)
        }

        fun provideToastManager(): ToastManager {
            return toastManager
        }
    }
}


/*
object AppInjector {


    lateinit var toastManager: ToastManager

    fun initialize(context: Context) {
        toastManager = ToastManager.getInstance(context)
    }
}*/
