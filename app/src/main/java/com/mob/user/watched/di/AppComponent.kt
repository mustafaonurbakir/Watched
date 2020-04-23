package com.mob.user.watched.di

import com.mob.user.watched.database.di.DatabaseModule
import com.mob.user.watched.pages.dashboard.di.DashboardModule
import dagger.Component

import javax.inject.Singleton


@Component(
    modules = [ContributeModule::class, DatabaseModule::class]
)
@Singleton
interface AppComponent : BaseAppComponent {

    @Component.Builder
    interface Builder : BaseAppComponent.Builder<AppComponent, Builder>
}
