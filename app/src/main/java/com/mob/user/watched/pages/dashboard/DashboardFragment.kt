package com.mob.user.watched.pages.dashboard


import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.mob.user.watched.R
import com.mob.user.watched.core.base.BaseFragment
import com.mob.user.watched.di.DaggerFragmentComponent
import com.mob.user.watched.di.FragmentModule
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain
import kotlinx.android.synthetic.main.activity_dashboard.*
import javax.inject.Inject

class DashboardFragment : BaseFragment(), DashboardContract.View {


    @Inject lateinit var presenter: DashboardContract.Presenter

    private lateinit var rootView: View

    var movieList = ArrayList<MoviesDomain>()



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
        createAList()
    }

    fun createAList(){

        //val movieList = java.util.ArrayList<MoviesDomain>()
        movieList.add(MoviesDomain("Ali","asdf","asdf"));
        movieList.add(MoviesDomain("ahmet","asdf","asdf"));
        movieList.add(MoviesDomain("flgdfv","asdf","asdf"));
        loadDataSuccess(movieList)

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

    fun loadDataSuccess(list: List<MoviesDomain>) {
        val adapter = ListAdapter(this.getActivity(), list.toMutableList(), this)
        recyclerView!!.layoutManager = LinearLayoutManager(context)
        recyclerView!!.adapter = adapter
    }

}
