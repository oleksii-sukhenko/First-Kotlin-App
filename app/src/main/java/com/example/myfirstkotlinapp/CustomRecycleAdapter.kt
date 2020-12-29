package com.example.myfirstkotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstkotlinapp.CustomRecyclerAdapter.MyViewHolder

class CustomRecyclerAdapter(private val values: List<String>) :
    RecyclerView.Adapter<MyViewHolder>() {
    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder{
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textItem?.text = values[position]

    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textItem: TextView? = null
        var imageItem: ImageView? = null

        init {

            textItem = itemView?.findViewById(R.id.textItem)
            imageItem = itemView?.findViewById(R.id.imageItem)
        }
    }

}
