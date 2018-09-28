package com.jaimejahuey.kotlinnetworkingexample.di

import com.jaimejahuey.kotlinnetworkingexample.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = arrayOf(AppModule::class, ViewModelModule::class))
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}