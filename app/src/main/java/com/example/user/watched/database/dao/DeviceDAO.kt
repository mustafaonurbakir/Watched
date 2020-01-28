package com.example.kolindeneme.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kolindeneme.database.entities.DeviceEntity
import com.example.kolindeneme.database.entities.DeviceEntity.Companion.TABLE_NAME

@Dao
interface DeviceDAO {

    @get:Query("SELECT * FROM $TABLE_NAME")
    val allDevices: Flowable<List<DeviceEntity>>

    @Query("SELECT * FROM $TABLE_NAME WHERE uuid=:uuid")
    fun getDevice(uuid: String): Single<DeviceEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDevice(device: DeviceEntity)

    @Query("DELETE FROM $TABLE_NAME WHERE uuid=:uuid")
    fun removeDevice(uuid: String)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteAllDevices()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllDevices(map: List<DeviceEntity>)
}
