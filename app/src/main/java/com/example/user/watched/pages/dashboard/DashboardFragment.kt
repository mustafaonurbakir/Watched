package com.example.user.watched.pages.dashboard


import android.os.Bundle
import com.example.user.watched.R
import com.example.user.watched.core.base.BaseFragment
import dagger.android.support.AndroidSupportInjection

import javax.inject.Inject

class DashboardFragment : BaseFragment(), DashboardContract.View {

    @Inject
    internal var presenter: DashboardContract.Presenter? = null


    override val contentViewID: Int
        get() = R.layout.activity_main

    override fun initView(savedInstanceState: Bundle?) {
        //ButterKnife.bind(this, getView());
        AndroidSupportInjection.inject(this)

        presenter!!.onCreate()
    }

    override fun onStart() {
        super.onStart()
        presenter!!.bind()
    }

    override fun onStop() {
        super.onStop()
        presenter!!.unBind()
    }

    companion object {

        private val UNKNOWN_ITEM = -1
    }

}
