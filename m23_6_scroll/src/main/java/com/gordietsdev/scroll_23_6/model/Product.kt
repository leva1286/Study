package com.gordietsdev.scroll_23_6.model

import androidx.annotation.DrawableRes
import com.gordietsdev.adapter_delegate23_5.model.Item

class Product(val id: Int, @DrawableRes val idIcon: Int, val name: String, val desc: String) : Item