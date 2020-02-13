package com.example.user.watched.pages.dashboard

interface DashboardContract {

    interface View {
    }

    interface Presenter {

        fun onCreate()

        fun bind()

        fun unBind()
    }

}
