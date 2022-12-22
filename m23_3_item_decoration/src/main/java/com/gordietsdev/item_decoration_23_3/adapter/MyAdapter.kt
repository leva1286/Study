package com.gordietsdev.item_decoration_23_3.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// реализуем класс Adapter для RecyclerView
class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyHolder>() {

    // реализуем вложенный клас ViewHolder для Adapter
    inner class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    // реализуем функцию Adapter которая создает ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(TextView(parent.context))
    }

    // реализуем функцию Adapter которая запалняет ViewHolder данными
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        (holder.itemView as TextView).text = "${position + 1}"
    }

    // реализуем функцию Adapter которая возвращает количество элементов
    override fun getItemCount(): Int {
        return 100
    }
}