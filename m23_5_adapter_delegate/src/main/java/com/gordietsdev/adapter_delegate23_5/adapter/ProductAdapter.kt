package com.gordietsdev.adapter_delegate23_5.adapter

import com.gordietsdev.adapter_delegate23_5.model.Item
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class ProductAdapter() : ListDelegationAdapter<List<Item>>() {

    init {
        delegatesManager.addDelegate(AdDelegateAdapter())
        delegatesManager.addDelegate(ProductDelegateAdapter())
    }

    override fun setItems(items: List<Item>?) {
        super.setItems(items)
        // можно реализовать через Diff
        notifyDataSetChanged()
    }
}