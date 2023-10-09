package com.example.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    private lateinit var toastManager: ToastManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)

        //toastManager = AppInjector.provideToastManager()

        toastManager = ToastManager.getInstance(this)

        btn.setOnClickListener {
            //AppInjector.toastManager.showToast("injected")
            toastManager.showToast("inject")
        }


    }
}