package com.mob.user.watched.pages.dashboard


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mob.user.watched.R
import com.mob.user.watched.core.base.BaseFragment
import com.mob.user.watched.di.DaggerFragmentComponent
import com.mob.user.watched.di.FragmentModule
import dagger.android.support.AndroidSupportInjection

import javax.inject.Inject

class DashboardFragment : BaseFragment(), DashboardContract.View {


    @Inject lateinit var presenter: DashboardContract.Presenter

    private lateinit var rootView: View

    override val contentViewID: Int
        get() = R.layout.activity_dashboard

    fun newInstance(): DashboardFragment {
        return DashboardFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency()
    }


    private fun injectDependency() {
        val dashboardComponent = DaggerFragmentComponent.builder()
            .fragmentModule(FragmentModule())
            .build()

        dashboardComponent.inject(this)
    }

    override fun initView(savedInstanceState: Bundle?) {
        //ButterKnife.bind(this, getView());
/*        AndroidSupportInjection.inject(this)

        presenter!!.onCreate()*/
    }

    override fun onStart() {
        super.onStart()
        presenter.bind()
    }

    override fun onStop() {
        super.onStop()
        presenter!!.unBind()
    }

    companion object {
        val TAG: String = "DashboardFragment"
    }

}
