package com.example.user.watched.core.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


abstract class BaseFragment : Fragment() {

    protected var activity: Activity? = null
    protected var mContext: Context? = null

    @get:LayoutRes
    protected abstract val contentViewID: Int

    protected abstract fun initView(savedInstanceState: Bundle?)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(contentViewID, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView(savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context
        if (context is Activity) {
            activity = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        mContext = null
        activity = null
    }

    override fun getView(): View {
        return super.getView()
    }
}
