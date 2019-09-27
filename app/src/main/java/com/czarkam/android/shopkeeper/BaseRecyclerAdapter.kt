package com.czarkam.android.shopkeeper

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import com.czarkam.android.shopkeeper.models.ReportEntry
import kotlinx.android.synthetic.main.card_layout.view.*

class BaseRecyclerAdapter(val itemClickListener: OnItemClickListener) : RecyclerView.Adapter<BlogViewHolder>() {

    var items: List<ReportEntry> = listOf()
    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val post = items.get(position)
        holder.bind(post,itemClickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        return BlogViewHolder(
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

class BlogViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    val reportTitle: TextView = itemView.reportTitle
    val reportName: TextView = itemView.reportName
    val reportDiagram: TextView = itemView.reportDiagram

    fun bind(blogPost: ReportEntry, clickListener: OnItemClickListener) {
        reportTitle.setText(blogPost.reportTitle)
        reportName.setText(blogPost.reportName)
        reportDiagram.setText(blogPost.reportDiagram)

        itemView.setOnClickListener {
            clickListener.onItemClicked(blogPost)
        }
    }

}

interface OnItemClickListener{
    fun onItemClicked(entry: ReportEntry)
}

