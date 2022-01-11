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

class ForgotPasswordFragment:Fragment(R.layout.forgort_password_fragment) {
    private lateinit var eTEmail2:EditText
    private lateinit var forgetPasswordButton2:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTEmail2 = view.findViewById(R.id.eTEmail2)
        forgetPasswordButton2 = view.findViewById(R.id.forgetPasswordButton2)
        forgetPasswordButton2.setOnClickListener {
            val email = eTEmail2.text.toString()
            if (email.isEmpty()){
                Toast.makeText(this.context, "field is empty", Toast.LENGTH_SHORT).show()
            }else{
                FirebaseAuth.getInstance().sendPasswordResetEmail(email).addOnCompleteListener {task->
                    if (task.isSuccessful){
                        Toast.makeText(this.context,"successfully done",Toast.LENGTH_SHORT).show()
                        Navigation.findNavController(view).navigate(ForgotPasswordFragmentDirections.actionForgotPasswordFragmentToLoginFragment())
                    }else{
                        Toast.makeText(this.context,"something went wrong try again",Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}