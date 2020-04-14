package com.mob.user.watched.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import com.mob.user.watched.database.entities.MoviesEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME, indices = [Index(value = arrayOf("movieName"), unique = true)])
class MoviesEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    var Id: Long = 0,

    @field:ColumnInfo(name = "movieName")
    var name: String,

    @field:ColumnInfo(name = "directory")
    var directory: String,

    @field:ColumnInfo(name = "star")
    var star: String,

    @field:ColumnInfo(name = "score")
    var score: Int

) {


    companion object {
        const val TABLE_NAME = "movies"
    }
}
