package com.mob.user.watched.pages.dashboard

import com.mob.user.watched.di.ActivityModule
import com.mob.user.watched.di.DaggerAppComponent
import com.mob.user.watched.di.DaggerBaseAppComponent
import com.mob.user.watched.pages.dashboard.api.MoviesInteractor
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named


class DashboardPresenter : DashboardContract.Presenter {
    //var compositeDisposable: CompositeDisposable

    private lateinit var view: DashboardContract.View

    @Inject
    lateinit var moviesInteract: MoviesInteractor









    init {

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
        //injectDependency()
    }

    override fun bind() {
        var year = 2019
    }

    override fun unBind() {
        //compositeDisposable.clear()
    }

    override fun loadDataSuccess(moviesDomain: List<MoviesDomain>){
        moviesInteract?.setMovie(moviesDomain[0])
    }

}
