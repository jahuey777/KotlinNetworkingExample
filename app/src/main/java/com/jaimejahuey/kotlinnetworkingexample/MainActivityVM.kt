package com.jaimejahuey.kotlinnetworkingexample

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.util.Log
import javax.inject.Inject

open class MainActivityVM @Inject constructor(var app:Application) : ViewModel () {


//    init {
//        Log.d("Application", ": $app")
//    }

}