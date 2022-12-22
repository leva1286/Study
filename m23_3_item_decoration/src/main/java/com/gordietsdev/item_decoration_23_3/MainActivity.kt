package com.gordietsdev.item_decoration_23_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.item_decoration_23_3.adapter.MyAdapter
import com.gordietsdev.item_decoration_23_3.decorator.MyItemDecoration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // присваиваем RecyclerView переменной в коде
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // создаем Adapter
        val adapter = MyAdapter()
        // присваиваем наш adapter recyclerView
        recyclerView.adapter = adapter

        // добавляем ItemDecoration в RecyclerView
        recyclerView.addItemDecoration(MyItemDecoration())
    }
}