package com.mob.user.watched

import android.app.Application

import com.mob.user.watched.di.BaseAppComponent
import com.mob.user.watched.di.DaggerAppComponent
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
            //.database(WatchedDatabase.getInstance(this))
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


/*class WatchedApplication : Application(), HasActivityInjector,
    HasSupportFragmentInjector, HasServiceInjector, HasBroadcastReceiverInjector {
    @Inject
    internal var fragmentInjector: DispatchingAndroidInjector<Fragment>? = null
    @Inject
    internal var activityInjector: DispatchingAndroidInjector<Activity>? = null
    @Inject
    internal var dispatchingServiceInjector: DispatchingAndroidInjector<Service>? = null
    @Inject
    internal var broadcastReceiverInjector: DispatchingAndroidInjector<BroadcastReceiver>? = null


    override fun onCreate() {
        super.onCreate()
        createAppComponent().inject(this)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector!!
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector!!
    }

    override fun serviceInjector(): AndroidInjector<Service> {
        return dispatchingServiceInjector!!
    }

    override fun broadcastReceiverInjector(): AndroidInjector<BroadcastReceiver> {
        return broadcastReceiverInjector!!
    }

    protected fun createAppComponent(): BaseAppComponent {
        return DaggerAppComponent.builder()
            .application(this)
            *//*.database(UmbrellaDatabase.getInstance(this))*//*
            .build()
    }
}*/
