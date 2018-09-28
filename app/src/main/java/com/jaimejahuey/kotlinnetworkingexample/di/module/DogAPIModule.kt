package com.jaimejahuey.kotlinnetworkingexample.di.module

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.jaimejahuey.kotlinnetworkingexample.repository.APIDog
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class DogAPIModule(var baseUrl: String) {

    @Provides
    @Singleton
    @Named("DogOkHttpClient")
    fun providesDogOkHttpClient(): OkHttpClient {

        //Adding Loggin interceptor
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    @Provides
    @Singleton
    @Named("DogRetrofit")
    fun providesDogRetrofit(@Named("DogOkHttpClient") okHttpClient:OkHttpClient):Retrofit {
        return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJ)
                .build()
    }

    @Provides
    @Singleton
    fun providesDogAPI(@Named("DogRetrofit")dogRetrofit: Retrofit): APIDog {
        return dogRetrofit.create(APIDog::class.java)
    }

}