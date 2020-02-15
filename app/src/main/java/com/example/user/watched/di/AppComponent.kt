package com.example.user.watched.di

import dagger.Component

import javax.inject.Singleton


@Component(
    modules = [
        AppModule::class,
        ContributeModule::class]
)
@Singleton
interface AppComponent : BaseAppComponent {

    @Component.Builder
    interface Builder : BaseAppComponent.Builder<AppComponent, Builder>
}
