package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.mobappsfinallydone.R

class ForgotPasswordFragment:Fragment(R.layout.forgort_password_fragment) {
    private lateinit var eTEmail2:EditText
    private lateinit var forgetPasswordButton2:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTEmail2 = view.findViewById(R.id.eTEmail2)
        forgetPasswordButton2 = view.findViewById(R.id.forgetPasswordButton2)
    }
}