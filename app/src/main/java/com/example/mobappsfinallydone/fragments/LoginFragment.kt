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

class LoginFragment:Fragment(R.layout.login_fragment) {
    private lateinit var eTEmail:EditText
    private lateinit var eTPassword:EditText
    private lateinit var loginButton:Button
    private lateinit var forgetPasswordButton:Button
    private lateinit var registrationButton:Button
    private lateinit var mAuth: FirebaseAuth
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mAuth = FirebaseAuth.getInstance()
        eTEmail = view.findViewById(R.id.eTEmail)
        eTPassword = view.findViewById(R.id.eTPassword)
        loginButton = view.findViewById(R.id.loginButton)
        forgetPasswordButton = view.findViewById(R.id.forgetPasswordButton)
        registrationButton = view.findViewById(R.id.registrationButton)
        val navController = Navigation.findNavController(view)
        registrationButton.setOnClickListener {
            val toRegistration = LoginFragmentDirections.actionLoginFragmentToRegistrationFragment()
            Navigation.findNavController(view).navigate(toRegistration)
        }
        forgetPasswordButton.setOnClickListener {
            val toForgetPassword = LoginFragmentDirections.actionLoginFragmentToForgotPasswordFragment()
            Navigation.findNavController(view).navigate(toForgetPassword)
        }
        loginButton.setOnClickListener {
            val email = eTEmail.text.toString()
            val password = eTPassword.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this.context, "Email and pasword is empty",Toast.LENGTH_SHORT).show()
            }else {
                mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful){
                            Toast.makeText(this.context,"successfully log in", Toast.LENGTH_SHORT).show()
                            navController.navigate(LoginFragmentDirections.actionLoginFragmentToProfileFragment())
                        }else {
                            Toast.makeText(this.context, "incorect email or password" , Toast.LENGTH_SHORT).show()
                        }
                }

            }
        }
    }
}