package com.example.mobappsfinallydone

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.Button

class MyDialog(context: Context): Dialog(context) {
    private lateinit var loginB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog)
        loginB = findViewById(R.id.loginB)
        loginB.setOnClickListener {
            dismiss()
        }
    }
}