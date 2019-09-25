package com.czarkam.android.shopkeeper

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.czarkam.android.shopkeeper.spacingItemDecoration.SpacingItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView() {

        recyclerView_main.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
            val spacingDecoration = SpacingItemDecoration(10,20,20, 10)
            addItemDecoration(spacingDecoration)
        }


    }


}
