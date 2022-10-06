package com.example.dagger2retrofit2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var myComponent: MyComponent
    @Inject
    lateinit var car: Car
    @Inject
    lateinit var engine: Engine
    lateinit var viewModel: MainViewModel
    @Inject
//    lateinit var mainViewModelFactory: MainViewModelFactory
    lateinit var mainViewModelFactory: DaggerViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent = (applicationContext as MyApp).myComponent
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val mainViewModelFactory = MainViewModelFactory(MyRepository())

        viewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)
        println(car)
        println(engine)
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}