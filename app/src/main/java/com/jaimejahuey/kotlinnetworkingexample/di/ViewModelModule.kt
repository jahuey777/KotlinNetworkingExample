package com.jaimejahuey.kotlinnetworkingexample.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.jaimejahuey.kotlinnetworkingexample.MainActivityVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityVM::class)
    abstract fun providesMainActivityVM(mainActivityVM: MainActivityVM): ViewModel

}