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
import com.google.firebase.ktx.Firebase

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

        registrationButton2.setOnClickListener {
            val name = eTName.text.toString()
            val secondName = eTName2.text.toString()
            val email = eTEmail3.text.toString()
            val password = eTPassword3.text.toString()
            if (name.isEmpty() || secondName.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this.context, "Fields are empty",Toast.LENGTH_SHORT).show()
            }else if ( password.length < 8 || name.length < 3 || secondName.length < 4) {
                Toast.makeText(this.context, "Fields are incorrectly filled", Toast.LENGTH_SHORT).show()
            }else if (password.contains("[0-9]".toRegex()) && password.contains("[a-z]".toRegex()) && password.contains("[A-Z]".toRegex())
                && name.contains("[a-z]".toRegex()) && secondName.contains("[a-z]".toRegex())){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        Toast.makeText(this.context,"successfully registered",Toast.LENGTH_SHORT).show()
                        Navigation.findNavController(view).navigate(RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment())
                    }else{
                        Toast.makeText(this.context, "some thing went wrong" , Toast.LENGTH_SHORT).show()
                    }
                }
            }else{
                Toast.makeText(this.context,"password must contain numbers, and english symbols lower and upper case ,name and second name must be only with english symbols.",Toast.LENGTH_LONG).show()
            }
        }
    }
}