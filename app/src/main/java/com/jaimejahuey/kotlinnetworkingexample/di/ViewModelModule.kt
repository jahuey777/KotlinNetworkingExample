package com.jaimejahuey.kotlinnetworkingexample.di

import com.jaimejahuey.kotlinnetworkingexample.MainActivityVM
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory) : ViewModelFactory

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityVM::class)
    abstract fun providesMainActivityVM(mainActivityVM: MainActivityVM): MainActivityVM

}