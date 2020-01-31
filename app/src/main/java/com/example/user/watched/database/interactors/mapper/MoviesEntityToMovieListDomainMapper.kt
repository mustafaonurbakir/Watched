package com.example.user.watched.database.interactors.mapper


import com.example.user.watched.database.entities.MoviesEntity
import com.example.user.watched.pages.dashboard.domain.MoviesDomain

import java.util.ArrayList

import javax.inject.Inject

import io.reactivex.functions.Function

class MoviesEntityToMovieListDomainMapper @Inject
internal constructor() : Function<List<MoviesEntity>, List<MoviesDomain>> {


    @Throws(Exception::class)
    override fun apply(moviesEntityList: List<MoviesEntity>): List<MoviesDomain> {
        val result = ArrayList<MoviesDomain>()
        for (moviesEntity in moviesEntityList) {
            result.add(
                MoviesDomain(
                    moviesEntity.name,
                    moviesEntity.directory,
                    moviesEntity.star
                )
            )
        }
        return result
    }
}
