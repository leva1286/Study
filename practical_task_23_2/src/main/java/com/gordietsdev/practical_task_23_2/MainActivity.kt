package com.gordietsdev.practical_task_23_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

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
    }
}