package com.example.mobappsfinallydone

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button

class MyDialog2(context: Context):Dialog(context) {
    private lateinit var okButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog2)
        okButton = findViewById(R.id.okButton)
        okButton.setOnClickListener {
            dismiss()
        }
    }
}