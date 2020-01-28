package com.example.kolindeneme.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import com.example.kolindeneme.database.entities.DeviceEntity.Companion.TABLE_NAME


@Entity(tableName = TABLE_NAME, indices = arrayOf(Index(value = arrayOf("uuid"), unique = true)))
class DeviceEntity(
    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "name")
    @get:NonNull
    var name: String,

    @field:NonNull
    @field:ColumnInfo(name = "state")
    @get:NonNull
    var isTurnOn: Boolean,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "uuid")
    @get:NonNull
    var uuid: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "mac")
    @get:NonNull
    var mac: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "type")
    @get:NonNull
    var type: String,

    @field:NonNull
    @field:ColumnInfo(name = "isActive")
    @get:NonNull
    var isActive: Boolean,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "softwareVersion")
    @get:NonNull
    var softwareVersion: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "model")
    @get:NonNull
    var model: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "featureType")
    @get:NonNull
    var featureType: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "configTimeInEpoch")
    var configTimeInEpoch: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "wgModel")
    @get:NonNull
    var wgModel: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "modelCD")
    @get:NonNull
    var modelCD: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "brand")
    @get:NonNull
    var brand: String,

    @param:NonNull @field:NonNull
    @field:ColumnInfo(name = "options")
    @get:NonNull
    var options: String
) {


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long = 0

    @NonNull
    fun getconfigTimeInEpoch(): String {
        return configTimeInEpoch
    }

    companion object {

        const val TABLE_NAME = "device"
    }
}
