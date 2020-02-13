package com.example.user.watched.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.example.user.watched.database.entities.MoviesEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME, indices = arrayOf(Index(value = arrayOf("movieName"), unique = true)))
class MoviesEntity(

    @param:NonNull
    @field:NonNull
    @field:ColumnInfo(name = "movieName")
    @get:NonNull
    var name: String,

    @field:NonNull
    @field:ColumnInfo(name = "directory")
    @get:NonNull
    var directory: String,

    @param:NonNull
    @field:NonNull
    @field:ColumnInfo(name = "star")
    @get:NonNull
    var star: String,

    @param:NonNull
    @field:NonNull
    @field:ColumnInfo(name = "score")
    @get:NonNull
    var score: Int

) {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @get:NonNull
    var id: Long = 0

    companion object {
        const val TABLE_NAME = "movies"
    }
}
