package com.example.mobappsfinallydone.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.mobappsfinallydone.R
import com.example.mobappsfinallydone.database.UserID
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class ProfileFragment:Fragment(R.layout.profile_fragment) {
    private lateinit var changeProfileInfo :Button
    private lateinit var profileIV:ImageView
    private lateinit var tVName:TextView
    private lateinit var tVSecondName:TextView
    private lateinit var loginButton2:Button
    private lateinit var changePassword:Button
    private lateinit var layout1:LinearLayout
    private lateinit var mAuth: FirebaseAuth
    private lateinit var db : DatabaseReference
    private lateinit var logOutButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        db = FirebaseDatabase.getInstance().getReference("UserInfo")
        profileIV = view.findViewById(R.id.profileIV)
        tVName = view.findViewById(R.id.tVName)
        tVSecondName = view.findViewById(R.id.tVSecondName)
        changePassword = view.findViewById(R.id.changePassword)
        layout1 = view.findViewById(R.id.layout1)
        mAuth = FirebaseAuth.getInstance()
        changeProfileInfo = view.findViewById(R.id.changeProfileInfo)
        logOutButton = view.findViewById(R.id.logOutButton)
        val navController = Navigation.findNavController(view)
        loginButton2 = view.findViewById(R.id.loginButton2)
        loginButton2.setOnClickListener {
            val toLogin = ProfileFragmentDirections.actionProfileFragmentToLoginFragment()
            navController.navigate(toLogin)
        }
        changePassword.setOnClickListener {
            navController.navigate(ProfileFragmentDirections.actionProfileFragmentToChangePasswordFragment())
        }
        changeProfileInfo.setOnClickListener {
            navController.navigate(ProfileFragmentDirections.actionProfileFragmentToProfileInfoFragment())
        }
        logOutButton.setOnClickListener {
            mAuth.signOut()
            navController.navigate(ProfileFragmentDirections.actionProfileFragmentSelf())
        }

        if (mAuth.currentUser?.uid  != null) {
            db.child(mAuth.currentUser?.uid!!).addValueEventListener(object : ValueEventListener{
                @SuppressLint("UseRequireInsteadOfGet")
                override fun onDataChange(snapshot: DataSnapshot) {
                    val userId = snapshot.getValue(UserID::class.java)
                    if (userId != null) {
                        activity?.let {
                            Glide
                                .with(it)
                                .load(userId.imageURL)
                                .into(profileIV)
                        }
                        tVName.text = userId.name
                        tVSecondName.text = userId.secondName
                       }
               }

               override fun onCancelled(error: DatabaseError) {
                   Log.d("TAG", error.message)
               }
           })
           layout1.visibility = View.VISIBLE
           loginButton2.visibility = View.GONE
       } else{
           layout1.visibility = View.INVISIBLE
           loginButton2.visibility = View.VISIBLE
       }
   }
}
