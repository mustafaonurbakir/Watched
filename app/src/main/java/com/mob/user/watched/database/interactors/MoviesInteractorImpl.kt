package com.mob.user.watched.database.interactors

import android.support.annotation.WorkerThread

import com.mob.user.watched.database.dao.MoviesDAO
import com.mob.user.watched.database.interactors.mapper.MoviesEntityToMovieItemDomainMapper
import com.mob.user.watched.database.interactors.mapper.MoviesEntityToMovieListDomainMapper
import com.mob.user.watched.pages.dashboard.api.MoviesInteractor
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain

import javax.inject.Inject

import io.reactivex.Flowable
import io.reactivex.Single

@WorkerThread
class MoviesInteractorImpl @Inject
internal constructor(
    private val moviesDAO: MoviesDAO,
    private val moviesEntityToMovieListDomainMapper: MoviesEntityToMovieListDomainMapper,
    private val moviesEntityToMovieItemDomainMapper: MoviesEntityToMovieItemDomainMapper
) : MoviesInteractor {

    override val moviesList: Flowable<List<MoviesDomain>>
        get() = moviesDAO.allMovies.map(moviesEntityToMovieListDomainMapper)

    override fun getMovie(name: String): Single<MoviesDomain> {
        return moviesDAO.getMovie(name).map(moviesEntityToMovieItemDomainMapper)
    }
}
