package com.jaimejahuey.kotlinnetworkingexample

//import android.databinding.DataBindingUtil
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jaimejahuey.kotlinnetworkingexample.di.ViewModelFactory
import javax.inject.Inject

//import com.jaimejahuey.kotlinnetworkingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelFactory
    lateinit var viewModel: MainActivityVM

//     @Inject var viewModelFactory: ViewModelFactory? = null
//    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        (application as AppApplication).appComponent.inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityVM::class.java)
    }

}
