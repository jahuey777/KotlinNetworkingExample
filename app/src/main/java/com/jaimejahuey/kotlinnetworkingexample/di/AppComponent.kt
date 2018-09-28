package com.jaimejahuey.kotlinnetworkingexample.di

import com.jaimejahuey.kotlinnetworkingexample.application.MainActivity
import com.jaimejahuey.kotlinnetworkingexample.di.module.AppModule
import com.jaimejahuey.kotlinnetworkingexample.di.module.DogAPIModule
import com.jaimejahuey.kotlinnetworkingexample.di.module.ViewModelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = arrayOf(AppModule::class, DogAPIModule::class,  ViewModelModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}