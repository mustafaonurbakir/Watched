package com.mob.user.watched

import android.app.Application
import com.mob.user.watched.database.WatchedDatabase
import com.mob.user.watched.database.di.DatabaseModule

import com.mob.user.watched.di.BaseAppComponent
import com.mob.user.watched.di.ApplicationModule
import com.mob.user.watched.di.DaggerBaseAppComponent


class WatchedApplication : Application(){

    lateinit var component: BaseAppComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        createAppComponent()
    }

    fun createAppComponent() {
        component =  DaggerBaseAppComponent.builder()
            .applicationModule(ApplicationModule(this))
            .databaseModule(DatabaseModule(WatchedDatabase.getInstance(this)))
            .build()
        return component.inject(this)
    }

    fun getApplicationComponent(): BaseAppComponent {
        return component
    }

    companion object {
        lateinit var instance: WatchedApplication private set
    }
}
