package com.example.dagger2retrofit2

import dagger.Component

@Component(modules = [MyModule::class, ViewModelFactoryModule::class,MyViewModelModule::class])
interface MyComponent {
    @Component.Builder
    interface Builder{
        fun build(): MyComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(secondActivity: SecondActivity)

}