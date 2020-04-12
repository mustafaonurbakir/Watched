package com.mob.user.watched.pages.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.mob.user.watched.R
import com.mob.user.watched.di.ActivityModule
import com.mob.user.watched.di.DaggerAppComponent
import com.mob.user.watched.pages.dashboard.DashboardFragment

import javax.inject.Inject


class MainActivity: AppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()

        presenter.attach(this)
        showListFragment()
    }

    override fun onResume() {
        super.onResume()
        test()
    }

/*    override fun showAboutFragment() {
        if (supportFragmentManager.findFragmentByTag(AboutFragment.TAG) == null) {
            supportFragmentManager.beginTransaction()
                    .addToBackStack(null)
                    .setCustomAnimations(AnimType.FADE.getAnimPair().first, AnimType.FADE.getAnimPair().second)
                    .replace(R.id.frame, AboutFragment().newInstance(), AboutFragment.TAG)
                    .commit()
        } else {
            // Maybe an animation like shake hello text
        }
    }*/

    fun showListFragment() {
        supportFragmentManager.beginTransaction()
                .disallowAddToBackStack()
                //.setCustomAnimations(AnimType.SLIDE.getAnimPair().first, AnimType.SLIDE.getAnimPair().second)
                .replace(R.id.fragment_main_activity, DashboardFragment().newInstance(), DashboardFragment.TAG)
                .commit()
    }

/*    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item!!.itemId) {
            R.id.nav_item_info -> {
                presenter.onDrawerOptionAboutClick()
                return true
            }
            else -> {

            }
        }

        return super.onOptionsItemSelected(item)
    }*/

/*    override fun onBackPressed() {
        val fragmentManager = supportFragmentManager
        val fragment = fragmentManager.findFragmentByTag(AboutFragment.TAG)

        if (fragment == null) {
            super.onBackPressed()
        } else {
            supportFragmentManager.popBackStack()
        }
    }*/

    private fun injectDependency() {
        val activityComponent = DaggerAppComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.inject(this)
    }

    private fun test() {
        //hello.setText("Hello world with kotlin extensions")
    }
}