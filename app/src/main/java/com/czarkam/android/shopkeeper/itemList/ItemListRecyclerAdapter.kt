package com.czarkam.android.shopkeeper.itemList

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.czarkam.android.shopkeeper.R
import com.czarkam.android.shopkeeper.models.ItemEntry

class ItemListRecyclerAdapter : RecyclerView.Adapter<ItemListItemViewHolder>() {

    private var items: List<ItemEntry> = listOf()
    override fun onBindViewHolder(holder: ItemListItemViewHolder, position: Int) {
        val post = items.get(position)
        holder.bind(post)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemListItemViewHolder {
        return ItemListItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_card_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(itemList: List<ItemEntry>) {
        items = itemList
    }

}