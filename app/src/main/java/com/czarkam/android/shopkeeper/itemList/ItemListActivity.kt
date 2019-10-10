package com.czarkam.android.shopkeeper.itemList

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.czarkam.android.shopkeeper.BaseRecyclerAdapter
import com.czarkam.android.shopkeeper.DataSource
import com.czarkam.android.shopkeeper.R
import com.czarkam.android.shopkeeper.spacingItemDecoration.SpacingItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list_layout.*

class ItemListActivity : AppCompatActivity() {

    private lateinit var itemListAdapter: ItemListRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_list_layout)

        initRecyclerView()
        addDataSet()
    }


    private fun initRecyclerView() {

        itemListAdapter = ItemListRecyclerAdapter()
        itemList.apply {
            layoutManager = LinearLayoutManager(this@ItemListActivity)
            val spacingDecoration = SpacingItemDecoration(10, 20, 20, 10)
            addItemDecoration(spacingDecoration)
            adapter = itemListAdapter

        }

    }

    private fun addDataSet() {
        val data = ItemDummyData.createDataSet()
        itemListAdapter.submitList(data)
    }

}
