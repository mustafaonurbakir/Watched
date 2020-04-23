package com.mob.user.watched.pages.dashboard


import javax.inject.Inject

class DashboardPresenter @Inject
internal constructor(
    val view: DashboardContract.View
) : DashboardContract.Presenter {
    //var compositeDisposable: CompositeDisposable
    //private var final view: DashboardContract.View ?= null
    init {
         //compositeDisposable = CompositeDisposable()
        //this.view = view
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
