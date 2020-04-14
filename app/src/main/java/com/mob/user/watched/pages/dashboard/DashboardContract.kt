package com.mob.user.watched.pages.dashboard

import com.mob.user.watched.core.base.BaseContract
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain

class DashboardContract {

    interface View :BaseContract.View {
    }

    interface Presenter: BaseContract.Presenter<View> {

        fun onCreate()

        fun bind()

        fun unBind()

        fun loadDataSuccess(moviesDomain: List<MoviesDomain>)
    }

}
