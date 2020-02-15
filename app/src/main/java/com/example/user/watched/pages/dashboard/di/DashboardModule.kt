package com.example.user.watched.pages.dashboard.di

import android.view.View
import com.example.user.watched.pages.dashboard.DashboardFragment
import dagger.Module
import dagger.Provides

@Module(includes = [DashboardBinderModule::class])
class DashboardModule {

    @Provides
    fun provideRootView(fragment: DashboardFragment): View? {
        return fragment.getView()
    }
}
