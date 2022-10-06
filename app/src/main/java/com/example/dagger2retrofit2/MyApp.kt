package com.example.dagger2retrofit2

import android.app.Application

class MyApp: Application() {
    lateinit var myComponent: MyComponent
    override fun onCreate() {
        super.onCreate()
        myComponent = DaggerMyComponent.builder().build()
    }
}