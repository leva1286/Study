package com.gordietsdev.m24_4_collapsing_toolbar_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appBar = findViewById<AppBarLayout>(R.id.app_bar)

        // добавляем слушатель изменений для AppBarLayout
        appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (verticalOffset == 0) {
                appBar.setBackgroundResource(R.color.black)
            }
            if (verticalOffset == appBarLayout.scrollBarSize) {
                appBar.setBackgroundResource(R.color.colorAccent)
            }
        })
    }
}