package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mobappsfinallydone.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.FirebaseDatabase

class ChangePasswordFragment:Fragment(R.layout.change_password_fragment) {
    private lateinit var eTNewPassword1:EditText
    private lateinit var eTNewPassword2:EditText
    private lateinit var acceptButton:Button
    private lateinit var backButton4: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        backButton4 = view.findViewById(R.id.backButton4)
        eTNewPassword1 = view.findViewById(R.id.eTNewPassword1)
        eTNewPassword2 = view.findViewById(R.id.eTNewPassword2)
        acceptButton = view.findViewById(R.id.acceptButton)
        backButton4.setOnClickListener {
            Navigation.findNavController(view).navigate(ChangePasswordFragmentDirections.actionChangePasswordFragmentToProfileFragment())
        }
        acceptButton.setOnClickListener {
            val password1 = eTNewPassword1.text.toString()
            val password2 = eTNewPassword2.text.toString()
            if (password1.isEmpty()|| password2.isEmpty()){
                Toast.makeText(this.context, "fields are empty", Toast.LENGTH_SHORT).show()
            }else if (password1 == password2){
                if (password1.contains("[0-9]".toRegex()) && password1.contains("[a-z]".toRegex())&&password1.contains("[A-Z]".toRegex())){
                    FirebaseAuth.getInstance().currentUser?.updatePassword(password1)?.addOnCompleteListener { task->
                        if (task.isSuccessful){
                            Toast.makeText(this.context,"successfully changed",Toast.LENGTH_SHORT).show()
                            Navigation.findNavController(view).navigate(ChangePasswordFragmentDirections.actionChangePasswordFragmentToProfileFragment())
                        }else {
                            Toast.makeText(this.context,"Somethign went wrong",Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
    }
}