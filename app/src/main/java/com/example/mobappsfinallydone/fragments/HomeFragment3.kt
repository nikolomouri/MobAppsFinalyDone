package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.mobappsfinallydone.MyDialog
import com.example.mobappsfinallydone.MyDialog2
import com.example.mobappsfinallydone.R
import com.example.mobappsfinallydone.database.*
import com.google.firebase.auth.FirebaseAuth

class HomeFragment3:Fragment(R.layout.home_fragment_3) {
    private lateinit var iVProduct9: ImageView
    private lateinit var iVProduct10: ImageView
    private lateinit var iVProduct11: ImageView
    private lateinit var iVProduct12: ImageView
    private lateinit var tVProductName9: TextView
    private lateinit var tVProductName10: TextView
    private lateinit var tVProductName11: TextView
    private lateinit var tVProductName12: TextView
    private lateinit var tVProductAmount9: TextView
    private lateinit var tVProductAmount10: TextView
    private lateinit var tVProductAmount11: TextView
    private lateinit var tVProductAmount12: TextView
    private lateinit var tVPrice9: TextView
    private lateinit var tVPrice10: TextView
    private lateinit var tVPrice11: TextView
    private lateinit var tVPrice12: TextView
    private lateinit var buyButton10: Button
    private lateinit var buyButton11: Button
    private lateinit var buyButton12: Button
    private lateinit var buyButton13: Button
    private lateinit var addCartButton10: Button
    private lateinit var addCartButton11: Button
    private lateinit var addCartButton12: Button
    private lateinit var addCartButton13: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iVProduct9 = view.findViewById(R.id.iVProduct9)
        iVProduct10 = view.findViewById(R.id.iVProduct10)
        iVProduct11 = view.findViewById(R.id.iVProduct11)
        iVProduct12 = view.findViewById(R.id.iVProduct12)
        tVProductName9 = view.findViewById(R.id.tVProductName9)
        tVProductName10 = view.findViewById(R.id.tVProductName10)
        tVProductName11 = view.findViewById(R.id.tVProductName11)
        tVProductName12 = view.findViewById(R.id.tVProductName12)
        tVProductAmount9 = view.findViewById(R.id.tVProductAmount9)
        tVProductAmount10 = view.findViewById(R.id.tVProductAmount10)
        tVProductAmount11 = view.findViewById(R.id.tVProductAmount11)
        tVProductAmount12 = view.findViewById(R.id.tVProductAmount12)
        tVPrice9 = view.findViewById(R.id.tVPrice9)
        tVPrice10 = view.findViewById(R.id.tVPrice10)
        tVPrice11 = view.findViewById(R.id.tVPrice11)
        tVPrice12 = view.findViewById(R.id.tVPrice12)
        buyButton10 = view.findViewById(R.id.buyButton10)
        buyButton11 = view.findViewById(R.id.buyButton11)
        buyButton12 = view.findViewById(R.id.buyButton12)
        buyButton13 = view.findViewById(R.id.buyButton13)
        addCartButton10 = view.findViewById(R.id.addCartButton10)
        addCartButton11 = view.findViewById(R.id.addCartButton11)
        addCartButton12 = view.findViewById(R.id.addCartButton12)
        addCartButton13 = view.findViewById(R.id.addCartButton13)
        tVProductName9.text = RTX3060().name
        tVProductName10.text = RTX3070().name
        tVProductName11.text = RTX3080().name
        tVProductName12.text = RTX3090().name
        tVProductAmount9.text = RTX3060().amount
        tVProductAmount10.text = RTX3070().amount
        tVProductAmount11.text = RTX3080().amount
        tVProductAmount12.text = RTX3090().amount
        tVPrice9.text = RTX3060().price
        tVPrice10.text = RTX3070().price
        tVPrice11.text = RTX3080().price
        tVPrice12.text = RTX3090().price
        this.context?.let {
            Glide.with(it).load(RTX3060().image).into(iVProduct9)
            Glide.with(it).load(RTX3070().image).into(iVProduct10)
            Glide.with(it).load(RTX3080().image).into(iVProduct11)
            Glide.with(it).load(RTX3090().image).into(iVProduct12)
            if (FirebaseAuth.getInstance().currentUser != null) {

                buyButton10.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton11.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton12.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton13.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
            } else {
                buyButton10.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton11.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton12.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton13.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton10.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton11.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton12.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton13.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
            }
        }
    }
}