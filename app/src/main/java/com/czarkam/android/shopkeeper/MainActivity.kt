package com.czarkam.android.shopkeeper

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addEntries()

        recyclerView_main.layoutManager = LinearLayoutManager(this)
        recyclerView_main.layoutManager = GridLayoutManager(this,3)
        recyclerView_main.adapter = RecAdapter(array, this)
    }

    val array: ArrayList<String> = ArrayList()

    fun addEntries(){
        array.add("Test1")
        array.add("Test2")
        array.add("Test3")
        array.add("Test4")
        array.add("Test5")
        array.add("Test6")
    }

}
