package com.mob.user.watched.di


import android.app.Application
import com.mob.user.watched.WatchedApplication
import com.mob.user.watched.database.WatchedDatabase
import dagger.BindsInstance

interface BaseAppComponent {

    fun inject(application: WatchedApplication)

    interface Builder<C : BaseAppComponent, B : Builder<C, B>> {

        @BindsInstance
        fun application(application: Application): B

        @BindsInstance
        fun database(roomDatabase: WatchedDatabase?): B

        fun build(): C
    }
}
