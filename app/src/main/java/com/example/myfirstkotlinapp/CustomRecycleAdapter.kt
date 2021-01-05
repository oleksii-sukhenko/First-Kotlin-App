package com.example.myfirstkotlinapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstkotlinapp.CustomRecyclerAdapter.MyViewHolder

class CustomRecyclerAdapter(private val values: List<String>) :
    RecyclerView.Adapter<MyViewHolder>() {

    private val images: IntArray = intArrayOf(R.drawable.january, R.drawable.february,
        R.drawable.march, R.drawable.april, R.drawable.may, R.drawable.june, R.drawable.july,
        R.drawable.august, R.drawable.september, R.drawable.october, R.drawable.november,
        R.drawable.december)

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textItem?.text = values[position]
        holder.imageItem?.setImageResource(images[position])



    }

     class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        var textItem: TextView? = null
        var imageItem: ImageView? = null

        init {
            textItem = itemView.findViewById(R.id.textItem)
            imageItem = itemView.findViewById(R.id.imageItem)
            itemView.setOnClickListener{
                val position: Int = adapterPosition
                Toast.makeText(itemView.context, "You picked ${position + 1} item",Toast.LENGTH_SHORT).show()
            }
        }
    }


    }



