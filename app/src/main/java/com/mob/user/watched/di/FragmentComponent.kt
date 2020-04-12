package com.mob.user.watched.di


import com.mob.user.watched.pages.dashboard.DashboardFragment
import dagger.Component


@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(dashboardFragment: DashboardFragment)

}