package com.example.user.watched.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.user.watched.database.dao.MoviesDAO
import com.example.user.watched.database.entities.MoviesEntity


@Database(
    entities = arrayOf( MoviesEntity::class ),
    version = 1
)
abstract class WatchedDatabase : RoomDatabase() {

    abstract fun moviesDAO(): MoviesDAO

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
