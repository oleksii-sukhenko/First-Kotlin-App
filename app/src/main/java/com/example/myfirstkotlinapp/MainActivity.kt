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

class MainActivity : Activity(), CustomRecyclerAdapter.MonthListener {

    val adapter = CustomRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter.callback = this
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        adapter.setData(fillList())
    }

    private fun fillList(): List<MonthItem>{
        val data = mutableListOf<MonthItem>()
        data.add(MonthItem("Январь", getColor(R.color.colorAccent)))
        data.add(MonthItem("Февраль", getColor(R.color.colorPrimary)))
        data.add(MonthItem("Март", this.getColor(R.color.colorPrimaryDark)))
        data.add(MonthItem("Апрель", this.getColor(R.color.colorAccent)))
        data.add(MonthItem("Май", this.getColor(R.color.colorAccent)))
        data.add(MonthItem("Июнь", this.getColor(R.color.colorPrimaryDark)))
        data.add(MonthItem("Июль", this.getColor(R.color.colorAccent)))
        data.add(MonthItem("Август", this.getColor(R.color.colorPrimary)))
        data.add(MonthItem("Сентябрь", this.getColor(R.color.colorAccent)))
        data.add(MonthItem("Октябрь", this.getColor(R.color.colorPrimary)))
        data.add(MonthItem("Ноябрь", this.getColor(R.color.colorAccent)))
        data.add(MonthItem("Декабрь", this.getColor(R.color.colorAccent)))
        return data
    }

    override fun onMonthClicked(item: MonthItem) {
        val intent = Intent(this, ContentActivity::class.java).apply {
            putExtra("name", item.name)
            putExtra("icon", item.icon)
        }
        startActivity(intent)
    }

}


