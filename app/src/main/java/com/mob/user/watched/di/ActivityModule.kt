package com.mob.user.watched.di

import android.app.Activity
import com.mob.user.watched.pages.main.MainContract
import com.mob.user.watched.pages.main.MainPresenter

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}