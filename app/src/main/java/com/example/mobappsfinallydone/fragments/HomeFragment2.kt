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
import com.example.mobappsfinallydone.database.RTX2060
import com.example.mobappsfinallydone.database.RTX2070
import com.example.mobappsfinallydone.database.RTX2080
import com.example.mobappsfinallydone.database.RTX2080TI
import com.google.firebase.auth.FirebaseAuth

class HomeFragment2:Fragment(R.layout.home_fragment_2) {
    private lateinit var iVProduct5: ImageView
    private lateinit var iVProduct6: ImageView
    private lateinit var iVProduct7: ImageView
    private lateinit var iVProduct8: ImageView
    private lateinit var tVProductName5: TextView
    private lateinit var tVProductName6: TextView
    private lateinit var tVProductName7: TextView
    private lateinit var tVProductName8: TextView
    private lateinit var tVProductAmount5: TextView
    private lateinit var tVProductAmount6: TextView
    private lateinit var tVProductAmount7: TextView
    private lateinit var tVProductAmount8: TextView
    private lateinit var tVPrice5: TextView
    private lateinit var tVPrice6: TextView
    private lateinit var tVPrice7: TextView
    private lateinit var tVPrice8: TextView
    private lateinit var buyButton6: Button
    private lateinit var buyButton7: Button
    private lateinit var buyButton8: Button
    private lateinit var buyButton9: Button
    private lateinit var addCartButton6: Button
    private lateinit var addCartButton7: Button
    private lateinit var addCartButton8: Button
    private lateinit var addCartButton9: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iVProduct5 = view.findViewById(R.id.iVProduct5)
        iVProduct6 = view.findViewById(R.id.iVProduct6)
        iVProduct7 = view.findViewById(R.id.iVProduct7)
        iVProduct8 = view.findViewById(R.id.iVProduct8)
        tVProductName5 = view.findViewById(R.id.tVProductName5)
        tVProductName6 = view.findViewById(R.id.tVProductName6)
        tVProductName7 = view.findViewById(R.id.tVProductName7)
        tVProductName8 = view.findViewById(R.id.tVProductName8)
        tVProductAmount5 = view.findViewById(R.id.tVProductAmount5)
        tVProductAmount6 = view.findViewById(R.id.tVProductAmount6)
        tVProductAmount7 = view.findViewById(R.id.tVProductAmount7)
        tVProductAmount8 = view.findViewById(R.id.tVProductAmount8)
        tVPrice5 = view.findViewById(R.id.tVPrice5)
        tVPrice6 = view.findViewById(R.id.tVPrice6)
        tVPrice7 = view.findViewById(R.id.tVPrice7)
        tVPrice8 = view.findViewById(R.id.tVPrice8)
        buyButton6 = view.findViewById(R.id.buyButton6)
        buyButton7 = view.findViewById(R.id.buyButton7)
        buyButton8 = view.findViewById(R.id.buyButton8)
        buyButton9 = view.findViewById(R.id.buyButton9)
        addCartButton6 = view.findViewById(R.id.addCartButton6)
        addCartButton7 = view.findViewById(R.id.addCartButton7)
        addCartButton8 = view.findViewById(R.id.addCartButton8)
        addCartButton9 = view.findViewById(R.id.addCartButton9)
        tVProductName5.text = RTX2060().name
        tVProductName6.text = RTX2070().name
        tVProductName7.text = RTX2080().name
        tVProductName8.text = RTX2080TI().name
        tVProductAmount5.text = RTX2060().amount
        tVProductAmount6.text = RTX2070().amount
        tVProductAmount7.text = RTX2080().amount
        tVProductAmount8.text = RTX2080TI().amount
        tVPrice5.text = RTX2060().price
        tVPrice6.text = RTX2070().price
        tVPrice7.text = RTX2080().price
        tVPrice8.text = RTX2080TI().price
        this.context?.let {
            Glide.with(it).load(RTX2060().image).into(iVProduct5)
            Glide.with(it).load(RTX2070().image).into(iVProduct6)
            Glide.with(it).load(RTX2080().image).into(iVProduct7)
            Glide.with(it).load(RTX2080TI().image).into(iVProduct8)
            if (FirebaseAuth.getInstance().currentUser != null) {

                buyButton6.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton7.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton8.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                buyButton9.setOnClickListener {
                    this.context?.let { it2 -> MyDialog2(it2).show() }
                }
                addCartButton6.setOnClickListener {
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToCartFragment().setProductID(5))
                }
                addCartButton7.setOnClickListener {
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToCartFragment().setProductID(6))
                }
                addCartButton8.setOnClickListener {
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToCartFragment().setProductID(7))
                }
                addCartButton9.setOnClickListener {
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToCartFragment().setProductID(8))
                }
            } else {
                buyButton6.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton7.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton8.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton9.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton6.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton7.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton8.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton9.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view)
                        .navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
            }
        }
    }
}