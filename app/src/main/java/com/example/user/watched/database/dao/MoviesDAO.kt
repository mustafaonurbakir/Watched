package com.example.kolindeneme.database.dao


import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.kolindeneme.database.entities.MoviesEntity
import com.example.kolindeneme.database.entities.MoviesEntity.Companion.TABLE_NAME
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface MoviesDAO {

    @get:Query("SELECT * FROM $TABLE_NAME")
    val allMovies: Flowable<List<MoviesEntity>>

    @Query("SELECT * FROM $TABLE_NAME WHERE name=:name")
    fun getMovie(name: String): Single<MoviesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDevice(movies: MoviesEntity)

/*    @Query("DELETE FROM $TABLE_NAME WHERE uuid=:uuid")
    fun removeDevice(uuid: String)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteAllDevices()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllDevices(map: List<MoviesEntity>)*/
}
