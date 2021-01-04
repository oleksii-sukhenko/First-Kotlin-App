package com.example.myfirstkotlinapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class Content: Activity() {
    private var position = 0
    private var category = 0

    private var titleText: TextView = findViewById(R.id.title_content)
    private var contentText: TextView = findViewById(R.id.text_main_content)


    private val array_content: IntArray = intArrayOf(R.string.january, R.string.february, R.string.march,
    R.string.april, R.string.may, R.string.june, R.string.july, R.string.august,
    R.string.september, R.string.october, R.string.november, R.string.december)

    private val array_title: Array<String> = arrayOf("January", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content)
        receiveIntent()
    }

    private fun receiveIntent(){
     val i: Intent = intent
        category = i.getIntExtra("category",0)
        position = i.getIntExtra("position",0)
        when(category){
            0 -> {titleText.text = array_title[position]
            contentText.text = array_content[position].toString()
            }
            1 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            2 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            3 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            4 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            5 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            6 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            7 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            8 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            9 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            10 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
            11 -> {titleText.text = array_title[position]
                contentText.text = array_content[position].toString()
            }
        }
    }

}




