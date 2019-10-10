package com.czarkam.android.shopkeeper.itemList

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.czarkam.android.shopkeeper.models.ItemEntry
import kotlinx.android.synthetic.main.item_card_layout.view.*

class ItemListItemViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    private val sku: TextView = itemView.itemSku
    private val itemName: TextView = itemView.itemName
    private val netPrice: TextView = itemView.netPrice

    fun bind(blogPost: ItemEntry) {
        sku.setText(blogPost.sku)
        itemName.setText(blogPost.itemName)
        netPrice.setText(blogPost.priceNet.toString())

    }

}
