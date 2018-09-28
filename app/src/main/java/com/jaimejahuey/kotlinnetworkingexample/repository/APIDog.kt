package com.jaimejahuey.kotlinnetworkingexample.repository

import okhttp3.Response
import retrofit2.http.GET

interface APIDog {

    @GET("breeds/list/all")
    fun getAllBreeds() : Response

}