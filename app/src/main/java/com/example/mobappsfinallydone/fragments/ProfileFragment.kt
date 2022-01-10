package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.mobappsfinallydone.R
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment:Fragment(R.layout.profile_fragment) {
    private lateinit var profileIV:ImageView
    private lateinit var eTPhoto:EditText
    private lateinit var tVName:TextView
    private lateinit var tVSecondName:TextView
    private lateinit var loginButton2:Button
    private lateinit var changeProfileImageButton:Button
    private lateinit var changePassword:Button
    private lateinit var layout1:LinearLayout
    private lateinit var mAuth: FirebaseAuth
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        profileIV = view.findViewById(R.id.profileIV)
        eTPhoto = view.findViewById(R.id.eTPhoto)
        tVName = view.findViewById(R.id.tVName)
        tVSecondName = view.findViewById(R.id.tVSecondName)
        changeProfileImageButton = view.findViewById(R.id.changeProfileImageButton)
        changePassword = view.findViewById(R.id.changePassword)
        layout1 = view.findViewById(R.id.layout1)
        mAuth = FirebaseAuth.getInstance()
        val navController = Navigation.findNavController(view)
//        val visible = ProfileFragmentArgs.fromBundle(requireArguments()).action
        loginButton2 = view.findViewById(R.id.loginButton2)
        loginButton2.setOnClickListener {
            val toLogin = ProfileFragmentDirections.actionProfileFragmentToLoginFragment()
            navController.navigate(toLogin)
        }
        changePassword.setOnClickListener {
            val toChangePassword = ProfileFragmentDirections.actionProfileFragmentToChangePasswordFragment()
            navController.navigate(toChangePassword)
        }
        changeProfileImageButton.setOnClickListener {
            if (eTPhoto.text.isEmpty()){
                Toast.makeText(this.context ,"The field is empty, if u want to change photo put url in it." ,Toast.LENGTH_LONG).show()
            }else {
                Glide.with(this).load(eTPhoto.text).into(profileIV)
            }
        }
//        if (){
//            layout1.visibility = View.VISIBLE
//            loginButton2.visibility = View.GONE
//        }
//        else{
//            layout1.visibility = View.INVISIBLE
//            loginButton2.visibility = View.VISIBLE
//
//        }
    }
}