package com.czarkam.android.shopkeeper

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import com.czarkam.android.shopkeeper.mainScreen.CardViewHolder
import com.czarkam.android.shopkeeper.models.ReportEntry
import kotlinx.android.synthetic.main.card_layout.view.*

class BaseRecyclerAdapter(private val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<CardViewHolder>() {

    private var items: List<ReportEntry> = listOf()
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val post = items.get(position)
        holder.bind(post,itemClickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(blogList: List<ReportEntry>) {
        items = blogList
    }

}


interface OnItemClickListener{
    fun onItemClicked(entry: ReportEntry)
}

