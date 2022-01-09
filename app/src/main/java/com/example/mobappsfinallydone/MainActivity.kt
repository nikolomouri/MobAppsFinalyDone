package com.example.mobappsfinallydone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationMenu = findViewById<BottomNavigationView>(R.id.bottomNavigationMenu)
        val controller = findNavController(R.id.nav_host_fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.notificationFragment,
                R.id.profileFragment
            )
        )
        setupActionBarWithNavController(controller,appBarConfiguration)
        bottomNavigationMenu.setupWithNavController(navController = controller)
    }
}