package com.mob.user.watched.pages.dashboard

import com.mob.user.watched.di.ActivityModule
//import com.mob.user.watched.di.DaggerAppComponent
//import com.mob.user.watched.di.DaggerBaseAppComponent
import com.mob.user.watched.pages.dashboard.api.MoviesInteractor
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named


class DashboardPresenter @Inject internal constructor (
    moviesInteract : MoviesInteractor
    ) : DashboardContract.Presenter {

    //var compositeDisposable: CompositeDisposable

    private lateinit var view: DashboardContract.View

    //@Inject
    private val moviesInteract: MoviesInteractor









    init {
        this.moviesInteract = moviesInteract
         //compositeDisposable = CompositeDisposable()
        //moviesInteractor = MoviesInteractor
    }
    override fun subscribe() {

    }

    override fun unsubscribe() {
        //subscriptions.clear()
    }
    override fun attach(view: DashboardContract.View) {
        this.view = view
    }

    override fun onCreate() {
        injectDependency()
    }

    override fun bind() {
        var year = 2019
    }

    override fun unBind() {
        //compositeDisposable.clear()
    }

    override fun loadDataSuccess(moviesDomain: List<MoviesDomain>){
        //if (moviesInteract.Is)
        moviesInteract?.setMovie(moviesDomain[0])
    }

    fun injectDependency(){

    }
}
