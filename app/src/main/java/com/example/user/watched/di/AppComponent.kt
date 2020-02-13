package com.example.user.watched.di

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

import javax.inject.Singleton

@Component(
    modules = arrayOf(
        AppModule::class,
        ContributeModule::class,
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class
    )
)
@Singleton
interface AppComponent : BaseAppComponent {

    @Component.Builder
    interface Builder : BaseAppComponent.Builder<AppComponent, Builder>
}
