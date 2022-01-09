package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.mobappsfinallydone.R

class ChangePasswordFragment:Fragment(R.layout.change_password_fragment) {
    private lateinit var eTNewPassword1:EditText
    private lateinit var eTNewPassword2:EditText
    private lateinit var acceptButton:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTNewPassword1 = view.findViewById(R.id.eTNewPassword1)
        eTNewPassword2 = view.findViewById(R.id.eTNewPassword2)
        acceptButton = view.findViewById(R.id.acceptButton)
    }
}