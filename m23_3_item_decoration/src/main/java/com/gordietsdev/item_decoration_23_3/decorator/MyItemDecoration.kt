package com.gordietsdev.item_decoration_23_3.decorator

import android.graphics.Canvas
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.item_decoration_23_3.R

class MyItemDecoration : RecyclerView.ItemDecoration() {

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)

        // отрисовывавем цвет фона
        parent.children.forEachIndexed{index, view ->
        if (index % 2 == 0) {
            view.setBackgroundResource(R.color.colorBlue)
        } else {
            view.setBackgroundResource(R.color.colorYellow)
        }
        }
    }
}