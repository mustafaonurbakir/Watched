package com.mob.user.watched.pages.dashboard.api

import com.mob.user.watched.pages.dashboard.domain.MoviesDomain
import io.reactivex.Flowable
import io.reactivex.Single

interface MoviesInteractor {

    val moviesList: Flowable<List<MoviesDomain>>

    fun getMovie(name: String): Single<MoviesDomain>

    fun setMovie(moviesDomain: MoviesDomain)

}
