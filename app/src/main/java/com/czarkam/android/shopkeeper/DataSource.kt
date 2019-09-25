package com.czarkam.android.shopkeeper

import com.czarkam.android.shopkeeper.models.BlogPost

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "Bit of data here in the future",
                    "Test text field",
                    "none",
                    "Item type entry"
                )
            )
            list.add(
                BlogPost(
                    "Additional data",
                    "Test text field2",
                    "none2",
                    "Sales order entry"
                )
            )


            return list
        }
    }
}