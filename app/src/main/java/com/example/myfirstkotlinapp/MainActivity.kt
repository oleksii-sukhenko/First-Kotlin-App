package com.example.myfirstkotlinapp

import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.graphics.LinearGradient
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomRecyclerAdapter(fillList())

    }
    private fun fillList():List<String>{
        val data = arrayListOf<String>()
        val month = this.resources.getStringArray(R.array.months).toList()
        (0..11).forEach {i -> data.add("${i+1} ${month[i]}")}
        return data
    }

}


