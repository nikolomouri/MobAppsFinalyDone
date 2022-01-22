package com.example.mobappsfinallydone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mobappsfinallydone.fragments.HomeFragmentDirections
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var mainLogIn:Button
    private lateinit var mainGuest:Button
    private lateinit var verticalLayout1:LinearLayout
    private lateinit var verticalLayout2:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        verticalLayout1 = findViewById(R.id.verticalLayout1)
        val bottomNavigationMenu = findViewById<BottomNavigationView>(R.id.bottomNavigationMenu)
        val controller = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.cartFragment,
                R.id.profileFragment
            )
        )
        setupActionBarWithNavController(controller,appBarConfiguration)
        bottomNavigationMenu.setupWithNavController(navController = controller)
    }
}