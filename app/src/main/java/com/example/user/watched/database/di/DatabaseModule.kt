package com.example.kolindeneme.database.di

import android.support.annotation.NonNull
import com.example.kolindeneme.database.dao.DeviceDAO
import com.example.user.watched.database.interactors.DatabaseInteractorBindingModule

import com.smarthome.core.main.database.WatchedDatabase


@Module(includes = { DatabaseInteractorBindingModule.class })
class DatabaseModule {

    @Provides
    @Singleton
    internal fun provideDeviceDAO(@NonNull watchedDatabase: WatchedDatabase): DeviceDAO {
        return watchedDatabase.deviceDAO()
    }

}
