package com.mob.user.watched.database.interactors.mapper


import com.mob.user.watched.database.entities.MoviesEntity
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain
import java.util.*
import javax.inject.Inject

class DeviceDomainToEntityMapper @Inject internal constructor() {
    fun map(domain: MoviesDomain): MoviesEntity {
        return MoviesEntity(
            3,
            domain.directory,
            domain.star,
            domain.directory,
            3
        )
    }

    fun map(devices: List<MoviesDomain>): List<MoviesEntity> {
        val mappedDevices: MutableList<MoviesEntity> =
            ArrayList<MoviesEntity>()
        for (device in devices) {
            mappedDevices.add(map(device))
        }
        return mappedDevices
    }
}