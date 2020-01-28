package com.example.kolindeneme.database.dao


import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.kolindeneme.database.entities.DeviceEntity
import com.example.kolindeneme.database.entities.DeviceEntity.Companion.TABLE_NAME
import io.reactivex.Flowable
import io.reactivex.Single

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
