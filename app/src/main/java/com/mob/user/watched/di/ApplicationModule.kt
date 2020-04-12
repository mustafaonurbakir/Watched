package com.mob.user.watched.di

import android.app.Application
import android.content.Context
import com.mob.user.watched.WatchedApplication
import com.mob.user.watched.scope.PerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule (private val watchedApplication: WatchedApplication) {

    @Provides
    @Singleton
    @PerApplication
    fun provideApplication(): Application {
        return watchedApplication
    }

}
