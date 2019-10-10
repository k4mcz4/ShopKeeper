package com.czarkam.android.shopkeeper.mainScreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.czarkam.android.shopkeeper.BaseRecyclerAdapter
import com.czarkam.android.shopkeeper.DataSource
import com.czarkam.android.shopkeeper.OnItemClickListener
import com.czarkam.android.shopkeeper.R
import com.czarkam.android.shopkeeper.itemList.ItemListActivity
import com.czarkam.android.shopkeeper.models.ReportEntry
import com.czarkam.android.shopkeeper.spacingItemDecoration.SpacingItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnItemClickListener {

    private lateinit var blogAdapter: BaseRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    override fun onItemClicked(entry: ReportEntry){
        if(entry.reportTitle == "Inwentarz"){
            val itemList = Intent(this,ItemListActivity::class.java)
            startActivity(itemList)
        }
    }

    private fun initRecyclerView() {

        blogAdapter = BaseRecyclerAdapter(this)
        recyclerView_main.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val spacingDecoration = SpacingItemDecoration(10, 20, 20, 10)
            addItemDecoration(spacingDecoration)
            adapter = blogAdapter

        }

    }

}
