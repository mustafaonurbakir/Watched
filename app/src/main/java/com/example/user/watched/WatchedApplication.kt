package com.example.user.watched

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.support.v4.app.Fragment

import com.example.user.watched.configuration.AppConfiguration
import com.example.user.watched.database.WatchedDatabase
import com.example.user.watched.di.BaseAppComponent
import com.smarthome.core.main.database.WatchedDatabase

import javax.inject.Inject

import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasBroadcastReceiverInjector
import dagger.android.HasServiceInjector
import dagger.android.support.HasSupportFragmentInjector

class WatchedApplication : Application(), HasActivityInjector, HasSupportFragmentInjector,
    HasServiceInjector, HasBroadcastReceiverInjector {

    @Inject
    internal var fragmentInjector: DispatchingAndroidInjector<Fragment>? = null
    @Inject
    internal var activityInjector: DispatchingAndroidInjector<Activity>? = null
    @Inject
    internal var dispatchingServiceInjector: DispatchingAndroidInjector<Service>? = null
    @Inject
    internal var broadcastReceiverInjector: DispatchingAndroidInjector<BroadcastReceiver>? = null

    @Inject
    internal var appConfiguration: AppConfiguration? = null

    override fun onCreate() {
        super.onCreate()
        createAppComponent().inject(this)
        appConfiguration!!.apply()
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment>? {
        return fragmentInjector
    }

    override fun activityInjector(): AndroidInjector<Activity>? {
        return activityInjector
    }

    override fun serviceInjector(): AndroidInjector<Service>? {
        return dispatchingServiceInjector
    }

    override fun broadcastReceiverInjector(): AndroidInjector<BroadcastReceiver>? {
        return broadcastReceiverInjector
    }

    protected fun createAppComponent(): BaseAppComponent {
        return DaggerAppComponent.builder()
            .application(this)
            .database(WatchedDatabase.getInstance(this))
            .build()
    }
}
