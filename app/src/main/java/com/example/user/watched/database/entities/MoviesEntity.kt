package com.example.user.watched.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.example.user.watched.database.entities.MoviesEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME, indices = arrayOf(Index(value = arrayOf("movieName"), unique = true)))
data class MoviesEntity(

    @field:ColumnInfo(name = "movieName")
    var name: String,

    @field:ColumnInfo(name = "directory")
    var directory: String,

    @field:ColumnInfo(name = "star")
    var star: String,

    @field:ColumnInfo(name = "score")
    var score: Int

) {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0

    companion object {
        const val TABLE_NAME = "movies"
    }
}
