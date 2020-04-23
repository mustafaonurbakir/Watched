package com.mob.user.watched.pages.dashboard.di

import com.mob.user.watched.pages.dashboard.DashboardContract
import com.mob.user.watched.pages.dashboard.DashboardFragment
import com.mob.user.watched.pages.dashboard.DashboardPresenter
import com.mob.user.watched.scope.FragmentViewScope

import dagger.Binds
import dagger.Module

@Module
interface DashboardBinderModule {


    @Binds
    @FragmentViewScope
    fun bindDashboardFragment(impl: DashboardFragment): DashboardContract.View


    @Binds
    @FragmentViewScope
    fun bindDashboardPresenter(impl: DashboardPresenter): DashboardContract.Presenter
}
