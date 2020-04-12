package com.mob.user.watched.di

import com.mob.user.watched.pages.dashboard.DashboardActivity
import com.mob.user.watched.pages.dashboard.di.DashboardModule
import dagger.Component

import javax.inject.Singleton


@Component(
    modules = arrayOf(DashboardModule::class)
)
//@Singleton
interface AppComponent {

    //@Component.Builder
    //interface Builder : BaseAppComponent.Builder<AppComponent, Builder>
    fun inject(dashboardActivity: DashboardActivity)
}
