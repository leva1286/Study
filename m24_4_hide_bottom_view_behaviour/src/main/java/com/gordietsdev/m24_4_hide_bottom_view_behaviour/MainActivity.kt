package com.gordietsdev.m24_4_hide_bottom_view_behaviour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.action_dialer -> Toast.makeText(this, "dialer", Toast.LENGTH_SHORT).show()
                R.id.action_mail -> Toast.makeText(this, "mail", Toast.LENGTH_SHORT).show()
                R.id.action_map -> Toast.makeText(this, "map", Toast.LENGTH_SHORT).show()
            }
            false
        }
    }
}