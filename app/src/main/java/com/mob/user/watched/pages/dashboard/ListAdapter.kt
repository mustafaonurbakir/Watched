package com.mob.user.watched.pages.dashboard

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mob.user.watched.R
import com.mob.user.watched.pages.dashboard.domain.MoviesDomain


class ListAdapter(private val context: Context, private val list: MutableList<MoviesDomain>,
                  fragment: Fragment): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    init {

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        val post = list[position]

        holder!!.title.text = post.name
        holder.body.text = post.directory
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.movie_card, parent, false)
        return ListViewHolder(itemView)
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.movie_name)
        val body: TextView = itemView.findViewById(R.id.movie_info)
    }

}