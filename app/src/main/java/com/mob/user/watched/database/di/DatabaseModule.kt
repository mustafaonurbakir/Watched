package com.mob.user.watched.database.di

import android.support.annotation.NonNull
import com.mob.user.watched.database.WatchedDatabase
import com.mob.user.watched.database.dao.MoviesDAO
import com.mob.user.watched.database.interactors.DatabaseInteractorBindingModule

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = [DatabaseInteractorBindingModule::class ])
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideDeviceDAO(@NonNull watchedDatabase: WatchedDatabase): MoviesDAO {
        return watchedDatabase.moviesDAO()
    }

}
