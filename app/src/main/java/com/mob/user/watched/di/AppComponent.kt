package com.mob.user.watched.di

import com.mob.user.watched.pages.dashboard.di.DashboardModule
import dagger.Component

import javax.inject.Singleton


@Component(
    modules = arrayOf(DashboardModule::class)
)
@Singleton
interface AppComponent : BaseAppComponent {

    @Component.Builder
    interface Builder : BaseAppComponent.Builder<AppComponent, Builder>
}
