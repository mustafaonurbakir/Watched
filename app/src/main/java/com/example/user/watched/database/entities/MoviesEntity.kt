package com.example.kolindeneme.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.example.kolindeneme.database.entities.MoviesEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME, indices = arrayOf(Index(value = arrayOf("name"), unique = true)))
class MoviesEntity(

    @param:NonNull
    @field:NonNull
    @field:ColumnInfo(name = "name")
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
    var id: Long = 0

    companion object {
        const val TABLE_NAME = "movies"
    }
}
