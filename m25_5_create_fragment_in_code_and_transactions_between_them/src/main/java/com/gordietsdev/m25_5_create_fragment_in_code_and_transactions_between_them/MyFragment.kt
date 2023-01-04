package com.gordietsdev.m25_5_create_fragment_in_code_and_transactions_between_them

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button_send)
        val editText = view.findViewById<EditText>(R.id.edit_text)
        val imageView = view.findViewById<ImageView>(R.id.image_button)

        button.setOnClickListener {
            (activity as MainActivity).passData(editText.text.toString(), imageView)
        }
    }
}