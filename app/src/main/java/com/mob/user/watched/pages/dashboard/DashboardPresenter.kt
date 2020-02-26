package com.mob.user.watched.pages.dashboard


import javax.inject.Inject

class DashboardPresenter @Inject
constructor(private val view: DashboardContract.View) : DashboardContract.Presenter {
    //var compositeDisposable: CompositeDisposable

    init {
         //compositeDisposable = CompositeDisposable()
    }

    override fun onCreate() {

    }

    override fun bind() {
        var year = 2019
    }

    override fun unBind() {
        //compositeDisposable.clear()
    }

}
