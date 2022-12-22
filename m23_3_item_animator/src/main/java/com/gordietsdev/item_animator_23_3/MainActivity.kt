package com.gordietsdev.item_animator_23_3

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.gordietsdev.item_animator_23_3.adapter.Product
import com.gordietsdev.item_animator_23_3.adapter.ProductAdapter
import com.gordietsdev.item_animator_23_3.animator.MyItemAnimator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        val adapter = ProductAdapter(
            arrayListOf(
                Product(
                    0,
                    R.drawable.ic_apple,
                    "Apple",
                    "Juicy Apple fruit, which is eaten fresh, serves as a raw material in cooking and for making drinks."
                ),
                Product(
                    1,
                    R.drawable.ic_banana,
                    "Banana",
                    "It is one of the oldest food crops, and for tropical countries it is the most important food plant and the main export item."
                ),
                Product(
                    2,
                    R.drawable.ic_lemon,
                    "Lemon",
                    "Lemons are eaten fresh, and are also used in the manufacture of confectionery and soft drinks, in the liquor and perfume industry."
                ),
                Product(
                    3,
                    R.drawable.ic_pear,
                    "Pear",
                    "Under favorable conditions, the pear reaches a large size-up to 5-25 meters in height and 5 meters in diameter of the crown."
                ),
                Product(
                    4,
                    R.drawable.ic_strawberry,
                    "Strawberry",
                    "A perennial herbaceous plant 5-20 cm high, with a thick brown rhizome. \"Mustache\" is short. The stem is thin."
                ),
                Product(
                    5,
                    R.drawable.ic_orange,
                    "Orange",
                    "Orange juice is widely used as a drink in restaurants and cafes."
                )
            )
        )
        recyclerView.adapter = adapter

        // добавляем ItemAnimator в RecyclerView
        recyclerView.itemAnimator = MyItemAnimator(applicationContext)

        // добавляем элемент
        val add = findViewById<Button>(R.id.add)
        add.setOnClickListener {
            adapter.data.add(
                Product(
                    adapter.data.size,
                    R.drawable.ic_strawberry,
                    "Strawberry",
                    "A perennial herbaceous plant 5-20 cm high, with a thick brown rhizome. \"Mustache\" is short. The stem is thin."
                )
            )
            adapter.notifyItemInserted(adapter.data.size - 1)

        }

        // удаляем элемент
        val remove = findViewById<Button>(R.id.remove)
        remove.setOnClickListener {
            adapter.data.removeLast()
            adapter.notifyItemRemoved(adapter.data.size)
        }
    }
}