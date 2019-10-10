package com.czarkam.android.shopkeeper.itemList

import com.czarkam.android.shopkeeper.models.ItemEntry

class ItemDummyData {
    companion object {
        fun createDataSet(): ArrayList<ItemEntry> {

            val list = ArrayList<ItemEntry>()

            list.add(
                ItemEntry(
                    "bro_war1",
                    "Pilsner",
                    1.13F
                )
            )

            return list

        }

        fun addItem(list: ArrayList<ItemEntry>, item: ItemEntry) {
            list.add(item)
        }

    }
}