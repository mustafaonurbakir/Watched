package com.mob.user.watched.database.dao


import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.mob.user.watched.database.entities.MoviesEntity
import com.mob.user.watched.database.entities.MoviesEntity.Companion.TABLE_NAME
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface MoviesDAO {

    @get:Query("SELECT * FROM $TABLE_NAME")
    val allMovies: Flowable<List<MoviesEntity>>

    @Query("SELECT * FROM $TABLE_NAME WHERE :movieName")
    fun getMovie(movieName: String): Single<MoviesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movies: MoviesEntity)

/*    @Query("DELETE FROM $TABLE_NAME WHERE aa=:aa")
    fun removeMovie(aa: String)

    @Query("DELETE FROM $TABLE_NAME")
    fun deleteAllMovies()*/
}
