package com.gordietsdev.m24_5_bottom_sheet

import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        val bottomSheet = findViewById<LinearLayout>(R.id.bottom_sheet)
        val tintBlack = findViewById<FrameLayout>(R.id.tint_black)

        // создаем объект класса BottomSheetBehavior который отвечает за все действия в BottomSheet
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        fab.setOnClickListener {
            // устанавливаем состояние для BottomSheet при котором он свернут и есть "язычок"
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        // добавляем Callback для BottomSheet
        bottomSheetBehavior.addBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onStateChanged(bottomSheet: View, newState: Int) {
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                tintBlack.alpha = slideOffset / 2
                if (1 - slideOffset <= 1) {
                    fab.scaleX = 1 - slideOffset
                    fab.scaleY = 1 - slideOffset
                }
            }

        })
    }
}