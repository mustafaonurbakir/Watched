package com.mob.user.watched.di

import android.app.Application
import android.content.Context
import com.mob.user.watched.scope.PerApplication
import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    @PerApplication
    fun provideContext(application: Application): Context {
        return application
    }

}
