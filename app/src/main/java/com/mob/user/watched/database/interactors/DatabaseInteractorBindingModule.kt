package com.mob.user.watched.database.interactors


import com.mob.user.watched.pages.dashboard.api.MoviesInteractor
import dagger.Binds
import dagger.Module

@Module
interface DatabaseInteractorBindingModule {

    @Binds
    fun bindMoviesInteractor(impl: MoviesInteractorImpl): MoviesInteractor

}
