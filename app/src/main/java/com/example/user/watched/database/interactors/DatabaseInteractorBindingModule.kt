package com.example.user.watched.database.interactors


import dagger.Binds
import dagger.Module

@Module
interface DatabaseInteractorBindingModule {

    @Binds
    fun bindMoviesInteractor(impl: MoviesInteractorImpl): MoviesInteractor

}
