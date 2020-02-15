package com.example.user.watched.di

import com.example.user.watched.pages.dashboard.di.DashboardContributeModule
import dagger.Module


@Module(includes = [DashboardContributeModule::class])
interface ContributeModule{}
