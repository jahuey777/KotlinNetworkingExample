package com.jaimejahuey.kotlinnetworkingexample.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = arrayOf(AppModule::class))
interface AppComponent {

}