package com.jaimejahuey.kotlinnetworkingexample

import android.app.Activity
import android.app.Application
import com.jaimejahuey.kotlinnetworkingexample.di.AppComponent
import com.jaimejahuey.kotlinnetworkingexample.di.AppModule
import com.jaimejahuey.kotlinnetworkingexample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class AppApplication: Application(){

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

//    private fun initDagger(app: AppApplication): AppComponent =
//            DaggerAppComponent.builder().appModule(AppModule(this)).build()
}