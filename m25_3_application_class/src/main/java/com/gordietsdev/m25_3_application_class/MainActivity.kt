package com.gordietsdev.m25_3_application_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // получаеь objectInAppClass
        val getObjectFromAppClass = App.instance.objectInAppClass
        findViewById<TextView>(R.id.text).text = getObjectFromAppClass
    }
}