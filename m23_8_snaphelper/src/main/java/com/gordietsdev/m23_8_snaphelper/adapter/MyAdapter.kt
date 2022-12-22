package com.gordietsdev.m23_8_snaphelper.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.m23_8_snaphelper.R
import com.gordietsdev.m23_8_snaphelper.model.Fruit

class MyAdapter(val data: ArrayList<Fruit>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon = itemView.findViewById<ImageView>(R.id.icon)
        val text_name = itemView.findViewById<TextView>(R.id.text_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.icon.setImageResource(data[position].idIcon)
        holder.text_name.text = data[position].name
    }

    override fun getItemCount(): Int {
        return data.size
    }
}