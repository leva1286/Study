package com.gordietsdev.item_animator_23_3.adapter

import androidx.annotation.DrawableRes

data class Product(val id: Int, @DrawableRes val idIcon: Int, val name: String, val desc: String)