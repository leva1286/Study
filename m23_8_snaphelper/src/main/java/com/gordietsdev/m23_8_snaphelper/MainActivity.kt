package com.gordietsdev.m23_8_snaphelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.m23_8_snaphelper.adapter.MyAdapter
import com.gordietsdev.m23_8_snaphelper.model.Fruit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
        // создаем объект LinearSnapHelper
        val snapHelper1 = LinearSnapHelper()
        // подключае объект LinearSnapHelper к RecyclerView
        snapHelper1.attachToRecyclerView(recyclerView1)

        fun data() : ArrayList<Fruit> = arrayListOf(
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

        val recyclerView2 = findViewById<RecyclerView>(R.id.recycler_view2)
        // создаем объект PageSnapHelper
        val snapHelper2 = PagerSnapHelper()
        // подключае объект PageSnapHelper к RecyclerView
        snapHelper2.attachToRecyclerView(recyclerView2)

        recyclerView2.adapter = MyAdapter(data())
    }
}