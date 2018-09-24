package com.jaimejahuey.kotlinnetworkingexample.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException
import javax.inject.Provider

class ViewModelFactory(val viewModels: Map<Class<out ViewModel >, Provider<ViewModel>> ): ViewModelProvider.Factory {

    @SuppressWarnings("unchecked")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val viewModelProvider: Provider<ViewModel>? = viewModels.get(modelClass)

        if(viewModelProvider == null) throw IllegalArgumentException("Model class" + modelClass + "not found")

        return viewModelProvider.get() as T
    }

//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        var viewModelProvider: Provider<ViewModel> = viewModels.get(modelClass)
//
//    }

}


//package com.jaimejahuey.kotlinnetworkingexample.di
//
//import android.arch.lifecycle.ViewModel
//import android.arch.lifecycle.ViewModelProvider
//import java.lang.IllegalArgumentException
//import javax.inject.Provider
//
//@Suppress("UNCHECKED_CAST")
//class ViewModelFactory(val viewModels: Map<Class<out ViewModel >, @JvmSuppressWildcards Provider<ViewModel>> ): ViewModelProvider.Factory {
//
//    @SuppressWarnings("unchecked")
//    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        var viewModelProvider: Provider<out ViewModel>? = viewModels[modelClass]
//
//        if(viewModelProvider == null) throw IllegalArgumentException("Model class" + modelClass + "not found")
//
//        return viewModelProvider.get() as T
//    }
//
////    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
////        var viewModelProvider: Provider<ViewModel> = viewModels.get(modelClass)
////
////    }
//
//}