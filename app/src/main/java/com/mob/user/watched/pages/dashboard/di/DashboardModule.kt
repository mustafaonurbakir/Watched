package com.mob.user.watched.pages.dashboard.di

import android.view.View
import com.mob.user.watched.pages.dashboard.DashboardFragment
import com.mob.user.watched.scope.Root
import dagger.Module
import dagger.Provides

@Module(includes = [DashboardBinderModule::class])
class DashboardModule {

    @Provides
    @Root
    fun provideRootView(fragment: DashboardFragment): View? {
        return fragment.getView()
    }
}
