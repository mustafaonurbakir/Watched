package com.example.kolindeneme.database.di

import android.support.annotation.NonNull
import com.example.kolindeneme.database.dao.DeviceDAO
import com.example.user.watched.database.interactors.DatabaseInteractorBindingModule

import com.smarthome.core.main.database.WatchedDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = arrayOf(DatabaseInteractorBindingModule::class ))
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideDeviceDAO(@NonNull watchedDatabase: WatchedDatabase): DeviceDAO {
        return watchedDatabase.deviceDAO()
    }

}
