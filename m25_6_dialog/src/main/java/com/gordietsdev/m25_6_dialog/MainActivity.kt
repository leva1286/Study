package com.gordietsdev.m25_6_dialog

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private var backPressed = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialogFragment = findViewById<Button>(R.id.DialogFragment)
        val btnAlertDialog = findViewById<Button>(R.id.AlertDialog)
        val btnData = findViewById<Button>(R.id.date_picker)
        val btnTime = findViewById<Button>(R.id.time_picker)
        val btnDataTime = findViewById<Button>(R.id.date_time_picker)

        val timeText = findViewById<TextView>(R.id.text_time)

        // создаем календарь и получаем время и дату
        val calendar = Calendar.getInstance()
        val currentYear = calendar.get(Calendar.YEAR)
        val currentMonth = calendar.get(Calendar.MONTH)
        val currentDay = calendar.get(Calendar.DAY_OF_MONTH)
        val currentHour = calendar.get(Calendar.HOUR_OF_DAY)
        val currentMinute = calendar.get(Calendar.MINUTE)

        btnAlertDialog.setOnClickListener {
            // создаем AlertDialog
            AlertDialog.Builder(ContextThemeWrapper(this, R.style.MyTheme))
                .setTitle("Вы хотите выйте?")
                .setIcon(R.drawable.ic_menu_gallery)
                .setMessage("Нам не хотелось бы, чтобы вы уходили")
                .setView(EditText(this))
                .setPositiveButton("Да") { _, _ ->
                    finish()
                }
                .setNegativeButton("Нет") { _, _ ->

                }
                .setNeutralButton("Не знаю") { _, _ ->
                    Toast.makeText(this, "Решайся", Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        btnDialogFragment.setOnClickListener {
            // создаем DialogFragment
            DialogFragment1().show(supportFragmentManager, "dialog1")
        }

        btnData.setOnClickListener {
            // создаем DatePickerDialog
            DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    val text = "$year $month, $dayOfMonth"
                    timeText.text = text
                },
                currentYear,
                currentMonth,
                currentDay
            ).show()
        }

        btnTime.setOnClickListener {
            // создадим TimePickerDialog
            val timePicker = TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                val text = "$hourOfDay $minute"
                timeText.text = text
            }

            TimePickerDialog(this, timePicker, currentHour, currentMinute, true).show()
        }

        // задаем дату и время одновременно
        btnDataTime.setOnClickListener {
            // создаем DatePickerDialog
            DatePickerDialog(
                this, DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                    val date = "$year $month, $dayOfMonth"

                    // создадим TimePickerDialog
                    val timePicker = TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                        val text = "$hourOfDay $minute $date"
                        timeText.text = text
                    }

                    TimePickerDialog(this, timePicker, currentHour, currentMinute, true).show()

                },
                currentYear,
                currentMonth,
                currentDay
            ).show()
        }
    }

    // переопределяем системную кнопку назад
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 1) {
            if (backPressed + TIME_INTERVAL > System.currentTimeMillis()) {
                super.onBackPressed()
                finish()
            } else {

                Toast.makeText(this, "Нажмите еще раз для выхода", Toast.LENGTH_SHORT).show()
            }

            backPressed = System.currentTimeMillis()
        } else {
            super.onBackPressed()
        }
    }

    companion object {
        const val TIME_INTERVAL = 2000
    }
}