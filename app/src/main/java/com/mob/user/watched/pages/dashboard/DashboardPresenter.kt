package com.mob.user.watched.pages.dashboard


class DashboardPresenter : DashboardContract.Presenter {
    //var compositeDisposable: CompositeDisposable

    private lateinit var view: DashboardContract.View

    init {
         //compositeDisposable = CompositeDisposable()
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

    }

    override fun bind() {
        var year = 2019
    }

    override fun unBind() {
        //compositeDisposable.clear()
    }

}
