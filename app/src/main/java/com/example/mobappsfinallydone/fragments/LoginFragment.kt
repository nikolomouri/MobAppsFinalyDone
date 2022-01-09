package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.mobappsfinallydone.R

class LoginFragment:Fragment(R.layout.login_fragment) {
    private lateinit var eTEmail:EditText
    private lateinit var eTPassword:EditText
    private lateinit var loginButton:Button
    private lateinit var forgetPasswordButton:Button
    private lateinit var registrationButton:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTEmail = view.findViewById(R.id.eTEmail)
        eTPassword = view.findViewById(R.id.eTPassword)
        loginButton = view.findViewById(R.id.loginButton)
        forgetPasswordButton = view.findViewById(R.id.forgetPasswordButton)
        registrationButton = view.findViewById(R.id.registrationButton)
    }
}