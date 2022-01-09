package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mobappsfinallydone.R

class ProfileFragment:Fragment(R.layout.profile_fragment) {
    private lateinit var profileIV:ImageView
    private lateinit var eTPhoto:EditText
    private lateinit var tVName:TextView
    private lateinit var tVSecondName:TextView
    private lateinit var loginButton2:Button
    private lateinit var changeProfileImageButton:Button
    private lateinit var changePassword:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        profileIV = view.findViewById(R.id.profileIV)
        eTPhoto = view.findViewById(R.id.eTPhoto)
        tVName = view.findViewById(R.id.tVName)
        tVSecondName = view.findViewById(R.id.tVSecondName)
        changeProfileImageButton = view.findViewById(R.id.changeProfileImageButton)
        changePassword = view.findViewById(R.id.changePassword)
        loginButton2 = view.findViewById(R.id.loginButton2)
    }
}