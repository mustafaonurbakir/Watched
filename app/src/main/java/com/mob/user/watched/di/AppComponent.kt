package com.mob.user.watched.di


import com.mob.user.watched.pages.main.MainActivity
import com.mob.user.watched.pages.main.MainPresenter
import dagger.Component

import javax.inject.Singleton


@Component(
    modules = arrayOf(ActivityModule::class)
)

interface AppComponent {


    fun inject(mainActivity: MainActivity)
}
