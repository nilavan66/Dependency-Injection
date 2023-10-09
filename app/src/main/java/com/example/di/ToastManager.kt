package com.example.di

import android.content.Context
import android.widget.Toast
import java.lang.ref.WeakReference

class ToastManager constructor (context: Context) {
    private val contextRef: WeakReference<Context> = WeakReference(context)

    fun showToast(message: String) {
        val context = contextRef.get()
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        private var instance: ToastManager? = null

        fun getInstance(context: Context): ToastManager {
            if (instance == null) {
                instance = ToastManager(context)
            }
            return instance!!
        }
    }

}