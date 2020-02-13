package com.example.user.watched.database.dao


import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.example.user.watched.database.entities.MoviesEntity
import com.example.user.watched.database.entities.MoviesEntity.Companion.TABLE_NAME
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface MoviesDAO {

    @get:Query("SELECT * FROM $TABLE_NAME")
    val allMovies: Flowable<List<MoviesEntity>>

    @Query("SELECT * FROM $TABLE_NAME WHERE :movieName")
    fun getMovie(movieName: String): Single<MoviesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDevice(movies: MoviesEntity)

}
