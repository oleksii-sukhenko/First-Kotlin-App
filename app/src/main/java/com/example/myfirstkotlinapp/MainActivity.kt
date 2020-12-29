package com.example.myfirstkotlinapp

import android.app.Activity
import android.graphics.LinearGradient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = CustomRecyclerAdapter(fillList())
        recyclerView.adapter = CustomRecyclerAdapter(getMonthList())
    }
    /*private fun fillList():List<String>{
        val data = mutableListOf<String>()
        (0..11).forEach {i -> data.add("${i+1} element")}
        return data
    }*/
    private fun getMonthList(): List<String> {

        val data = mutableListOf<String>()
        val month = this.resources.getStringArray(R.array.months_of_the_year).toList()
        (1..12).forEach {i -> data.add("$i $month") }
        return data
        //return this.resources.getStringArray(R.array.months_of_the_year).toList()
    }


}