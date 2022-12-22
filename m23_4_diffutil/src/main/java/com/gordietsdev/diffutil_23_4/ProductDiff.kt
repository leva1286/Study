package com.gordietsdev.diffutil_23_4

import androidx.recyclerview.widget.DiffUtil

class ProductDiff(val oldList: List<Product>, val newList: List<Product>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val old = oldList[oldItemPosition]
        val new = newList[newItemPosition]

        return old.desc == new.desc && old.name == new.name && old.idIcon == new.idIcon
    }
}