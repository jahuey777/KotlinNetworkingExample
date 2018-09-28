package com.jaimejahuey.kotlinnetworkingexample.repository

import io.realm.Realm

class RealmHelper {

    lateinit var realm : Realm

    fun openRealm(){
        realm = Realm.getDefaultInstance();
    }


}