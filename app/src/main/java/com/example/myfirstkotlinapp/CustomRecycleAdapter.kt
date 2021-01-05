package com.example.myfirstkotlinapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstkotlinapp.CustomRecyclerAdapter.MyViewHolder
import kotlinx.android.synthetic.main.recyclerview_item.view.*

class CustomRecyclerAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private var list = listOf<MonthItem>()

    private val viewHolder = MyViewHolder

    var callback: MonthListener? = null
        set(value) {
            field = value
            viewHolder.callbackItem = { month -> callback?.onMonthClicked(month) }
        }

    fun setData(items: List<MonthItem>) {
        list = items
        notifyDataSetChanged()
    }

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        companion object {
            var callbackItem: ((task: MonthItem) -> Unit)? = null
        }

        fun bind(item: MonthItem) {
            itemView.textItem?.text = item.name
            itemView.imageItem?.setBackgroundColor(item.icon)
            itemView.setOnClickListener {
                callbackItem?.invoke(item)
            }
        }
    }

    interface MonthListener {
        fun onMonthClicked(item: MonthItem)
    }

}



