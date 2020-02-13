package com.example.user.watched.pages.dashboard.di;

import com.example.user.watched.pages.dashboard.DashboardContract;
import com.example.user.watched.pages.dashboard.DashboardFragment;
import com.example.user.watched.pages.dashboard.DashboardPresenter;

import dagger.Binds;
import dagger.Module;

@Module
public interface DashboardBinderModule {


    @Binds
    DashboardContract.View bindDashboardFragment(DashboardFragment impl);



    @Binds
    DashboardContract.Presenter bindDashboardPresenter(DashboardPresenter impl);
}
