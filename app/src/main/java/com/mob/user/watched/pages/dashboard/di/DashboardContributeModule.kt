package com.mob.user.watched.pages.dashboard.di


import com.mob.user.watched.pages.dashboard.DashboardFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface DashboardContributeModule {

    @ContributesAndroidInjector(modules = [DashboardModule::class])
    fun bindDashboardFragment(): DashboardFragment

}