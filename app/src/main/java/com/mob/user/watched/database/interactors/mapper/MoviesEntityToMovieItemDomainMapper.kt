package com.mob.user.watched.database.interactors.mapper


import com.mob.user.watched.database.entities.MoviesEntity
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain

import javax.inject.Inject

import io.reactivex.functions.Function

class MoviesEntityToMovieItemDomainMapper @Inject
internal constructor() : Function<MoviesEntity, MoviesDomain> {


    @Throws(Exception::class)
    override fun apply(moviesEntity: MoviesEntity): MoviesDomain {
        return MoviesDomain(
            moviesEntity.name,
            moviesEntity.directory,
            moviesEntity.star
        )
    }
}
