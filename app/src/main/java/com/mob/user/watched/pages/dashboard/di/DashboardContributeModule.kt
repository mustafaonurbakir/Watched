package com.mob.user.watched.pages.dashboard.di


import com.mob.user.watched.pages.dashboard.DashboardFragment
import com.mob.user.watched.scope.FragmentViewScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface DashboardContributeModule {

    @FragmentViewScope
    @ContributesAndroidInjector(modules = [DashboardModule::class])
    fun bindDashboardFragment(): DashboardFragment

}