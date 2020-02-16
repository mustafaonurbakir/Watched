package com.example.user.watched.pages.dashboard

import android.os.Bundle
import com.example.user.watched.R
import com.example.user.watched.core.base.BaseActivity

class DashboardActivity : BaseActivity() {

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
        setContentView(R.layout.activity_dashboard)
    }
}
