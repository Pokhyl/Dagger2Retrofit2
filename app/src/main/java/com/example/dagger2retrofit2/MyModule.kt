package com.example.dagger2retrofit2

import dagger.Module
import dagger.Provides

@Module
class MyModule() {
    @Provides
    fun createCar(): Car{
        return Car()
    }
}