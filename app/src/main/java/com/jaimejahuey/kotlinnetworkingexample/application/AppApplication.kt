package com.jaimejahuey.kotlinnetworkingexample.application

import android.app.Application
import com.jaimejahuey.kotlinnetworkingexample.di.AppComponent
import com.jaimejahuey.kotlinnetworkingexample.di.module.AppModule
import com.jaimejahuey.kotlinnetworkingexample.di.DaggerAppComponent

class AppApplication: Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

//    private fun initDagger(app: AppApplication): AppComponent =
//            DaggerAppComponent.builder().appModule(AppModule(this)).build()
}