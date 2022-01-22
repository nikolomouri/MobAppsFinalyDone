package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.mobappsfinallydone.R
import com.example.mobappsfinallydone.database.UserID
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class ProfileInfoFragment:Fragment(R.layout.profile_info_fragment) {
    private lateinit var eTName1:EditText
    private lateinit var eTName2:EditText
    private lateinit var eTImageURL:EditText
    private lateinit var saveButton:Button
    private lateinit var backButton:Button
    private lateinit var db : DatabaseReference
    private lateinit var mAuth: FirebaseAuth
    private lateinit var eTAdress : EditText
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eTName1 = view.findViewById(R.id.eTName1)
        eTName2 = view.findViewById(R.id.eTName2)
        eTImageURL = view.findViewById(R.id.eTImageURL)
        saveButton = view.findViewById(R.id.saveButton)
        backButton = view.findViewById(R.id.backButton)
        eTAdress = view.findViewById(R.id.eTAdress)
        mAuth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance().getReference("UserInfo")
        saveButton.setOnClickListener {
            val name = eTName1.text.toString()
            val secondName = eTName2.text.toString()
            val imageUrl = eTImageURL.text.toString()
            val adress = eTAdress.text.toString()
            val personInfo = UserID(name,secondName,imageUrl,adress)
            if (name.isEmpty()||secondName.isEmpty()){
                Toast.makeText(this.context ,"The field is empty, if u want to change photo put url in it." ,Toast.LENGTH_LONG).show()
            }else {
                if (mAuth.currentUser?.uid != null) {
                    db.child(mAuth.currentUser?.uid!!).setValue(personInfo).addOnCompleteListener { task->
                        if (task.isSuccessful){
                            Toast.makeText(this.context,"successfully saved",Toast.LENGTH_SHORT).show()
                            eTName1.text = null
                            eTName2.text = null
                            eTImageURL.text = null
                            eTAdress.text = null
                        }else{
                            Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
        }
        backButton.setOnClickListener {
            Navigation.findNavController(view).navigate(ProfileInfoFragmentDirections.actionProfileInfoFragmentToProfileFragment())
        }
    }
}
