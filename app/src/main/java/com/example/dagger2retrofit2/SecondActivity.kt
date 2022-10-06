package com.example.dagger2retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    lateinit var myComponent: MyComponent
//    @Inject
//    lateinit var viewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as MyApp).myComponent
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        val viewModel = ViewModelProvider(this, viewModelFactory).get(SecondViewModel::class.java)
//        println(viewModel.engine)
    }
}