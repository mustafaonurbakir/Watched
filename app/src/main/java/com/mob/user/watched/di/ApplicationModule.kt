package com.mob.user.watched.di

import android.app.Application
import android.content.Context
import com.mob.user.watched.WatchedApplication
import com.mob.user.watched.scope.PerApplication
import dagger.Module
import dagger.Provides
import io.reactivex.annotations.NonNull
import javax.inject.Singleton

@Module
class ApplicationModule  {

    @Provides
    @Singleton
    @PerApplication
    fun provideContext(application: Application): Context {
        return application
    }

}
