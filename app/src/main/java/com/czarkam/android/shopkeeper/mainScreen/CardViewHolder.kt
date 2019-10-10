package com.czarkam.android.shopkeeper.mainScreen

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.czarkam.android.shopkeeper.OnItemClickListener
import com.czarkam.android.shopkeeper.models.ReportEntry
import kotlinx.android.synthetic.main.card_layout.view.*

class CardViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    private val reportTitle: TextView = itemView.reportTitle
    private val reportName: TextView = itemView.reportName
    private val reportDiagram: TextView = itemView.reportDiagram

    fun bind(blogPost: ReportEntry, clickListener: OnItemClickListener) {
        reportTitle.setText(blogPost.reportTitle)
        reportName.setText(blogPost.reportName)
        reportDiagram.setText(blogPost.reportDiagram)

        itemView.setOnClickListener {
            clickListener.onItemClicked(blogPost)
        }

    }

}