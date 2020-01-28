package com.smarthome.core.main.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kolindeneme.database.dao.DeviceDAO
import com.example.kolindeneme.database.entities.DeviceEntity


@Database(
    entities = { DeviceEntity.class },
    version = 1
)
abstract class WatchedDatabase : RoomDatabase() {

    abstract fun deviceDAO(): DeviceDAO

    companion object {

        @Volatile
        private var INSTANCE: WatchedDatabase? = null

        fun getInstance(context: Context): WatchedDatabase? {
            if (INSTANCE == null) {
                synchronized(WatchedDatabase::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = Room.databaseBuilder(
                            context.applicationContext,
                            WatchedDatabase::class.java, "dbase_1.db"
                        )
                            .build()
                    }
                }
            }
            return INSTANCE
        }
    }
}
