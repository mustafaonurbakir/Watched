package com.example.user.watched.pages.dashboard.di;


import com.example.user.watched.pages.dashboard.DashboardFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface DashboardContributeModule {

    @ContributesAndroidInjector(modules = DashboardModule.class)
    DashboardFragment bindDashboardFragment();

}