package com.mob.user.watched.pages.dashboard


import android.os.Bundle
import com.mob.user.watched.R
import com.mob.user.watched.core.base.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class DashboardFragment : BaseFragment(), DashboardContract.View {

    @Inject
    lateinit var presenter: DashboardContract.Presenter

    override val contentViewID: Int
        get() = R.layout.activity_dashboard

    override fun initView(savedInstanceState: Bundle?) {
        //ButterKnife.bind(this, getView());
        AndroidSupportInjection.inject(this)

        presenter!!.onCreate()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        //presenter!!.bind()
        //injectDependency()
    }

    override fun onStop() {
        super.onStop()
        //presenter!!.unBind()
    }

    companion object {

    }


}
