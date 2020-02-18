package com.mob.user.watched.pages.dashboard

interface DashboardContract {

    interface View {
    }

    interface Presenter {

        fun onCreate()

        fun bind()

        fun unBind()
    }

}
