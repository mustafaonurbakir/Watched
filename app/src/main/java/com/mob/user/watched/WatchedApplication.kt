package com.mob.user.watched

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.support.v4.app.Fragment

import com.mob.user.watched.database.WatchedDatabase
import com.mob.user.watched.di.AppComponent
import com.mob.user.watched.di.BaseAppComponent
import com.mob.user.watched.di.DaggerAppComponent
import dagger.android.*
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class WatchedApplication : Application(),
    HasActivityInjector,
    HasSupportFragmentInjector {

    lateinit var component: AppComponent


    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>


    override fun onCreate() {
        super.onCreate()

        instance = this
        createAppComponent().inject(this)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector!!
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector!!
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