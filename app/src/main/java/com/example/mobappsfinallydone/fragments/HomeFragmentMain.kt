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
import com.example.mobappsfinallydone.database.GTX1080
import com.example.mobappsfinallydone.database.GTX1080TI
import com.example.mobappsfinallydone.database.GTX1650
import com.example.mobappsfinallydone.database.GTX1660
import com.google.firebase.auth.FirebaseAuth

class HomeFragmentMain:Fragment(R.layout.home_fragment_main) {
    private lateinit var iVProduct1:ImageView
    private lateinit var iVProduct2:ImageView
    private lateinit var iVProduct3:ImageView
    private lateinit var iVProduct4:ImageView
    private lateinit var tVProductName1:TextView
    private lateinit var tVProductName2:TextView
    private lateinit var tVProductName3:TextView
    private lateinit var tVProductName4:TextView
    private lateinit var tVProductAmount1:TextView
    private lateinit var tVProductAmount2:TextView
    private lateinit var tVProductAmount3:TextView
    private lateinit var tVProductAmount4:TextView
    private lateinit var tVPrice1:TextView
    private lateinit var tVPrice2:TextView
    private lateinit var tVPrice3:TextView
    private lateinit var tVPrice4:TextView
    private lateinit var buyButton2:Button
    private lateinit var buyButton3:Button
    private lateinit var buyButton4:Button
    private lateinit var buyButton5:Button
    private lateinit var addCartButton2:Button
    private lateinit var addCartButton3:Button
    private lateinit var addCartButton4:Button
    private lateinit var addCartButton5:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iVProduct1 = view.findViewById(R.id.iVProduct1)
        iVProduct2 = view.findViewById(R.id.iVProduct2)
        iVProduct3 = view.findViewById(R.id.iVProduct3)
        iVProduct4 = view.findViewById(R.id.iVProduct4)
        tVProductName1 = view.findViewById(R.id.tVProductName1)
        tVProductName2 = view.findViewById(R.id.tVProductName2)
        tVProductName3 = view.findViewById(R.id.tVProductName3)
        tVProductName4 = view.findViewById(R.id.tVProductName4)
        tVProductAmount1 = view.findViewById(R.id.tVProductAmount1)
        tVProductAmount2 = view.findViewById(R.id.tVProductAmount2)
        tVProductAmount3 = view.findViewById(R.id.tVProductAmount3)
        tVProductAmount4 = view.findViewById(R.id.tVProductAmount4)
        tVPrice1 = view.findViewById(R.id.tVPrice1)
        tVPrice2 = view.findViewById(R.id.tVPrice2)
        tVPrice3 = view.findViewById(R.id.tVPrice3)
        tVPrice4 = view.findViewById(R.id.tVPrice4)
        buyButton2 = view.findViewById(R.id.buyButton2)
        buyButton3 = view.findViewById(R.id.buyButton3)
        buyButton4 = view.findViewById(R.id.buyButton4)
        buyButton5 = view.findViewById(R.id.buyButton5)
        addCartButton2 = view.findViewById(R.id.addCartButton2)
        addCartButton3 = view.findViewById(R.id.addCartButton3)
        addCartButton4 = view.findViewById(R.id.addCartButton4)
        addCartButton5 = view.findViewById(R.id.addCartButton5)
        tVProductName1.text = GTX1080().name
        tVProductName2.text = GTX1080TI().name
        tVProductName3.text = GTX1650().name
        tVProductName4.text = GTX1660().name
        tVProductAmount1.text = GTX1080().amount
        tVProductAmount2.text = GTX1080TI().amount
        tVProductAmount3.text = GTX1650().amount
        tVProductAmount4.text = GTX1660().amount
        tVPrice1.text = GTX1080().price
        tVPrice2.text = GTX1080TI().price
        tVPrice3.text = GTX1650().price
        tVPrice4.text = GTX1660().price
        this.context?.let {
            Glide.with(it).load(GTX1080().image).into(iVProduct1)
            Glide.with(it).load(GTX1080TI().image).into(iVProduct2)
            Glide.with(it).load(GTX1650().image).into(iVProduct3)
            Glide.with(it).load(GTX1660().image).into(iVProduct4)
            if (FirebaseAuth.getInstance().currentUser != null){

                buyButton2.setOnClickListener {
                    this.context?.let {it2-> MyDialog2(it2).show() }
                }
                buyButton3.setOnClickListener {
                    this.context?.let {it2-> MyDialog2(it2).show() }
                }
                buyButton4.setOnClickListener {
                    this.context?.let {it2-> MyDialog2(it2).show() }
                }
                buyButton5.setOnClickListener {
                    this.context?.let {it2-> MyDialog2(it2).show() }
                }
            }else{
                buyButton2.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton3.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton4.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                buyButton5.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton2.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton3.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton4.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
                addCartButton5.setOnClickListener {
                    this.context?.let { it1 -> MyDialog(it1).show() }
                    Navigation.findNavController(view).navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                }
            }
        }
    }
}
