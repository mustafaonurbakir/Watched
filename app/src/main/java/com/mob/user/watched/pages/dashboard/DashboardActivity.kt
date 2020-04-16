package com.mob.user.watched.pages.dashboard

import android.content.Intent
import android.os.Bundle
import com.mob.user.watched.R
import com.mob.user.watched.core.base.BaseActivity

class DashboardActivity : BaseActivity() {

    private val dashboardFragment: DashboardFragment = DashboardFragment()

    override fun onStart() {
        super.onStart()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //setTheme(R.style.AppTheme_NoActionBar);
        /*        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);*/
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launchLoginFragment()
    }

    private fun launchLoginFragment() {
        val fragmentManager = supportFragmentManager
        val transaction =
            fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_main, dashboardFragment, null)
        transaction.commit()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val fragment = supportFragmentManager.findFragmentById(R.id.fragment_dashboard)
        fragment?.onActivityResult(requestCode, resultCode, data)
    }
}
