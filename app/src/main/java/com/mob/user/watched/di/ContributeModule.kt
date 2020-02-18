package com.mob.user.watched.di

import com.mob.user.watched.pages.dashboard.di.DashboardContributeModule
import dagger.Module


@Module(includes = [DashboardContributeModule::class])
interface ContributeModule{}
