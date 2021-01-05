package com.example.myfirstkotlinapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_content.*
import kotlinx.android.synthetic.main.activity_main.*

class ContentActivity : Activity() {

    private var name: String? = ""
    private var icon = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)
        receiveIntent()
    }

    private fun receiveIntent() {
        val i: Intent = intent
        name = i.getStringExtra("name")
        icon = i.getIntExtra("icon", 0)
        text_main_content.text = name
    }

}




