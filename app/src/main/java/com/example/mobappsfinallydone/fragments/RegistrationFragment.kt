package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.mobappsfinallydone.R

class RegistrationFragment:Fragment(R.layout.registration_fragment) {
    private lateinit var eTName:EditText
    private lateinit var eTName2:EditText
    private lateinit var eTEmail3:EditText
    private lateinit var eTPassword3:EditText
    private lateinit var registrationButton2:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTName = view.findViewById(R.id.eTName)
        eTName2 = view.findViewById(R.id.eTName2)
        eTEmail3 = view.findViewById(R.id.eTEmail3)
        eTPassword3 = view.findViewById(R.id.eTPassword3)
        registrationButton2 = view.findViewById(R.id.registrationButton2)
    }
}