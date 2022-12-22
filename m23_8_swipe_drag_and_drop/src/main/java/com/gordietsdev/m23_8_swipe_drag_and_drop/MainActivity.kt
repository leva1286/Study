package com.gordietsdev.m23_8_swipe_drag_and_drop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.m23_8_swipe_drag_and_drop.adapter.MyAdapter
import com.gordietsdev.m23_8_swipe_drag_and_drop.model.Fruit
import com.gordietsdev.m23_8_swipe_drag_and_drop.touch_helper.SimpleItemTouchHelperCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
        fun data(): ArrayList<Fruit> = arrayListOf(
            Fruit(R.drawable.ic_apple, "Apple"),
            Fruit(R.drawable.ic_banana, "Banana"),
            Fruit(R.drawable.ic_lemon, "Lemon"),
            Fruit(R.drawable.ic_orange, "Orange"),
            Fruit(R.drawable.ic_pear, "Pear"),
            Fruit(R.drawable.ic_pear, "Pear1"),
            Fruit(R.drawable.ic_pear, "Pear2"),
            Fruit(R.drawable.ic_pear, "Pear3"),
            Fruit(R.drawable.ic_strawberry, "Strawberry"),
        )
        recyclerView1.adapter = MyAdapter(data())

        // создаем объект класса ItemTouchHelper.Callback
        val callback = SimpleItemTouchHelperCallback(recyclerView1.adapter as MyAdapter)
        // создаем объеке класс ItemTouchHelper
        val touchHelper = ItemTouchHelper(callback)
        // подключаем ItemTouchHelper к RecyclerView
        touchHelper.attachToRecyclerView(recyclerView1)
    }
}