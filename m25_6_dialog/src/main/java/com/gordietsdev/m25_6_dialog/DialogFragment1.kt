package com.gordietsdev.m25_6_dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class DialogFragment1 : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnYes = view.findViewById<Button>(R.id.btn_y)
        val btnNo = view.findViewById<Button>(R.id.btn_n)
        val btnOther = view.findViewById<Button>(R.id.btn_other)

        btnYes.setOnClickListener {
            Toast.makeText(context, "Yes", Toast.LENGTH_SHORT).show()
        }
        btnNo.setOnClickListener {
            Toast.makeText(context, "No", Toast.LENGTH_SHORT).show()
            dialog?.dismiss()
        }
        btnOther.setOnClickListener {
            Toast.makeText(context, "Other", Toast.LENGTH_SHORT).show()
        }
    }

    // Выпольняеться когда диалог закрываеться
    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
    }

    // Выполняеться когда мы отменяем диалог кнопкой или нажатием вне области
    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
    }
}