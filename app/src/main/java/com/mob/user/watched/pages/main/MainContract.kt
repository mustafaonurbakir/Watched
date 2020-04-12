package com.mob.user.watched.pages.main

import com.mob.user.watched.core.base.BaseContract


class MainContract {

    interface View: BaseContract.View {
        //fun showListFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        //fun onDrawerOptionAboutClick()
    }
}