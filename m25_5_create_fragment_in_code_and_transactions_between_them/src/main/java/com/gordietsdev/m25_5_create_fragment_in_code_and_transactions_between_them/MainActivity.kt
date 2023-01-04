package com.gordietsdev.m25_5_create_fragment_in_code_and_transactions_between_them

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tag = "fragment 1"

        // помещаем фрагмент в контейнер
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, MyFragment(), tag)
            .addToBackStack(null).commit()
    }

    fun passData(edittext: String, imageView: ImageView) {
        val bundle = Bundle()
        bundle.putString("input", edittext)

        val fragment2 = MyFragment2()
        fragment2.arguments = bundle

        supportFragmentManager.beginTransaction().addSharedElement(imageView, "transition1")
            .addToBackStack(null).replace(R.id.fragment_container, fragment2).commit()
    }
}