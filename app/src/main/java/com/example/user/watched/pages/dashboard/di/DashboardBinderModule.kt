package com.example.user.watched.pages.dashboard.di

import com.example.user.watched.pages.dashboard.DashboardContract
import com.example.user.watched.pages.dashboard.DashboardFragment
import com.example.user.watched.pages.dashboard.DashboardPresenter

import dagger.Binds
import dagger.Module

@Module
interface DashboardBinderModule {


    @Binds
    fun bindDashboardFragment(impl: DashboardFragment): DashboardContract.View


    @Binds
    fun bindDashboardPresenter(impl: DashboardPresenter): DashboardContract.Presenter
}
