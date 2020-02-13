package com.example.user.watched.pages.dashboard


import io.reactivex.disposables.CompositeDisposable

import javax.inject.Inject

class DashboardPresenter @Inject
constructor(private val view: DashboardContract.View) : DashboardContract.Presenter {
    private val compositeDisposable: CompositeDisposable

    init {
        compositeDisposable = CompositeDisposable()
    }

    override fun onCreate() {

    }

    override fun bind() {

    }

    override fun unBind() {
        compositeDisposable.clear()
    }

}
