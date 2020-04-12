package com.mob.user.watched.pages.dashboard

class DashboardContract {

    interface View {
    }

    interface Presenter {

        fun onCreate()

        fun bind()

        fun unBind()
    }

}
