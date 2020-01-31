package com.example.user.watched.database.di

import android.support.annotation.NonNull
import com.example.user.watched.database.WatchedDatabase
import com.example.user.watched.database.dao.MoviesDAO
import com.example.user.watched.database.interactors.DatabaseInteractorBindingModule

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = arrayOf(DatabaseInteractorBindingModule::class ))
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideDeviceDAO(@NonNull watchedDatabase: WatchedDatabase): MoviesDAO {
        return watchedDatabase.moviesDAO()
    }

}
