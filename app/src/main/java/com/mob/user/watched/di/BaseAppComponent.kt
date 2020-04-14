package com.mob.user.watched.di


import android.app.Application
import com.mob.user.watched.WatchedApplication
import com.mob.user.watched.database.WatchedDatabase
import com.mob.user.watched.database.di.DatabaseModule
import com.mob.user.watched.di.ApplicationModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class,
    DatabaseModule::class))
interface BaseAppComponent {

    fun inject(application: WatchedApplication)
    /**
     * @param <B> actual Builder class
     * @param <C> actual Component class
     */

    fun inject(watchedDatabase: WatchedDatabase)
/*    interface Builder<C : BaseAppComponent, B : Builder<C, B>> {

        @BindsInstance
        fun application(application: Application): B

        @BindsInstance
        fun database(roomDatabase: WatchedDatabase?): B

        fun build(): C
    }*/
}
