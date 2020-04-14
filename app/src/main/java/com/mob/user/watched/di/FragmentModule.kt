package com.mob.user.watched.di

import com.mob.user.watched.pages.dashboard.DashboardContract
import com.mob.user.watched.pages.dashboard.DashboardPresenter
import dagger.Module
import dagger.Provides


@Module
class FragmentModule {

    @Provides
    fun provideDashboardPresenter(): DashboardContract.Presenter {
        return DashboardPresenter()
    }

}