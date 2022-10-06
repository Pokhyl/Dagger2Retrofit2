package com.example.dagger2retrofit2
import kotlin.reflect.KClass


import androidx.lifecycle.ViewModel
import dagger.MapKey

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)