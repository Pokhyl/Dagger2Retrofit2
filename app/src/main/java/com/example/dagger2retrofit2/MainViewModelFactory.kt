package com.example.dagger2retrofit2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(val repository: MyRepository, val engine: Engine): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

     if (modelClass.isAssignableFrom(MainViewModel::class.java!!)) {
        return MainViewModel(repository) as T
    }
     else if (modelClass.isAssignableFrom(SecondViewModel::class.java!!)) {
            return SecondViewModel(engine) as T
        }else {
        throw IllegalArgumentException("ViewModel Not Found")
    }
}
}