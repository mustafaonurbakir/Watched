package com.example.user.watched

import android.app.Application

import com.example.user.watched.database.WatchedDatabase
import com.example.user.watched.di.AppComponent
import com.example.user.watched.di.BaseAppComponent
import com.example.user.watched.di.DaggerAppComponent

class WatchedApplication : Application(){

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        createAppComponent().inject(this)
    }

    protected fun createAppComponent(): BaseAppComponent {
        return DaggerAppComponent.builder()
            .application(this)
            .database(WatchedDatabase.getInstance(this))
            .build()
    }

    fun getApplicationComponent(): AppComponent {
        return component
    }

    companion object {
        lateinit var instance: WatchedApplication private set
    }
}
