package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.mobappsfinallydone.MyDialog2
import com.example.mobappsfinallydone.R
import com.example.mobappsfinallydone.database.*

class CartFragment:Fragment(R.layout.cart_fragment) {
    private var products = ArrayList<Int>()
    private lateinit var tVName13 :TextView
    private lateinit var tVPrice13:TextView
    private lateinit var lLL1:LinearLayout
    private lateinit var cartBuyButton1:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tVName13 = view.findViewById(R.id.tVName13)
        tVPrice13= view.findViewById(R.id.tVPrice13)
        lLL1 = view.findViewById(R.id.lLL1)
        cartBuyButton1 = view.findViewById(R.id.cartBuyButton1)
        products.add(CartFragmentArgs.fromBundle(requireArguments()).productID)
        if (products.contains(1)){
                lLL1.visibility = View.VISIBLE
                tVName13.text =GTX1080().name
                tVPrice13.text = GTX1080().price
                Glide.with(view).load(GTX1080().image).into(view.findViewById(R.id.iVProduct13))
                cartBuyButton1.visibility= View.VISIBLE
        }
        if (products.contains(2)){
            view.findViewById<LinearLayout>(R.id.lLL2).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName14).text = GTX1080TI().name
            view.findViewById<TextView>(R.id.tVPrice14).text = GTX1080TI().price
            Glide.with(view).load(GTX1080TI().image).into(view.findViewById(R.id.iVProduct14))
            cartBuyButton1.visibility= View.VISIBLE
        }
        if (products.contains(3)){
            view.findViewById<LinearLayout>(R.id.lLL3).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName15).text = GTX1650().name
            view.findViewById<TextView>(R.id.tVPrice15).text = GTX1650().price
            Glide.with(view).load(GTX1650().image).into(view.findViewById(R.id.iVProduct15))
            cartBuyButton1.visibility= View.VISIBLE
        }
        if (products.contains(4)){
            view.findViewById<LinearLayout>(R.id.lLL4).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName16).text = GTX1660().name
            view.findViewById<TextView>(R.id.tVPrice16).text = GTX1660().price
            Glide.with(view).load(GTX1660().image).into(view.findViewById(R.id.iVProduct16))
            cartBuyButton1.visibility= View.VISIBLE
        }
        if (products.contains(5)){
            view.findViewById<LinearLayout>(R.id.lLL5).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName17).text =RTX2060().name
            view.findViewById<TextView>(R.id.tVPrice17).text = RTX2060().price
            Glide.with(view).load(RTX2060().image).into(view.findViewById(R.id.iVProduct17))
            view.findViewById<Button>(R.id.cartBuyButton2).visibility= View.VISIBLE
        }
        if (products.contains(6)){
            view.findViewById<LinearLayout>(R.id.lLL6).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName18).text = RTX2070().name
            view.findViewById<TextView>(R.id.tVPrice18).text = RTX2070().price
            Glide.with(view).load(RTX2070().image).into(view.findViewById(R.id.iVProduct18))
            view.findViewById<Button>(R.id.cartBuyButton2).visibility= View.VISIBLE
        }
        if (products.contains(7)){
            view.findViewById<LinearLayout>(R.id.lLL7).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName19).text = RTX2080().name
            view.findViewById<TextView>(R.id.tVPrice19).text = RTX2080().price
            Glide.with(view).load(RTX2080().image).into(view.findViewById(R.id.iVProduct19))
            view.findViewById<Button>(R.id.cartBuyButton2).visibility= View.VISIBLE
        }
        if (products.contains(8)){
            view.findViewById<LinearLayout>(R.id.lLL8).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName20).text = RTX2080TI().name
            view.findViewById<TextView>(R.id.tVPrice20).text = RTX2080TI().price
            Glide.with(view).load(RTX2080TI().image).into(view.findViewById(R.id.iVProduct20))
            view.findViewById<Button>(R.id.cartBuyButton2).visibility= View.VISIBLE
        }
        if (products.contains(9)){
            view.findViewById<LinearLayout>(R.id.lLL9).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName21).text =RTX2060().name
            view.findViewById<TextView>(R.id.tVPrice21).text = RTX2060().price
            Glide.with(view).load(RTX2060().image).into(view.findViewById(R.id.iVProduct21))
            view.findViewById<Button>(R.id.cartBuyButton3).visibility= View.VISIBLE
        }
        if (products.contains(10)){
            view.findViewById<LinearLayout>(R.id.lLL10).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName22).text = RTX2070().name
            view.findViewById<TextView>(R.id.tVPrice22).text = RTX2070().price
            Glide.with(view).load(RTX2070().image).into(view.findViewById(R.id.iVProduct22))
            view.findViewById<Button>(R.id.cartBuyButton3).visibility= View.VISIBLE
        }
        if (products.contains(11)){
            view.findViewById<LinearLayout>(R.id.lLL11).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName23).text = RTX2080().name
            view.findViewById<TextView>(R.id.tVPrice23).text = RTX2080().price
            Glide.with(view).load(RTX2080().image).into(view.findViewById(R.id.iVProduct23))
            view.findViewById<Button>(R.id.cartBuyButton3).visibility= View.VISIBLE
        }
        if (products.contains(12)){
            view.findViewById<LinearLayout>(R.id.lLL12).visibility = View.VISIBLE
            view.findViewById<TextView>(R.id.tVName24).text = RTX2080TI().name
            view.findViewById<TextView>(R.id.tVPrice24).text = RTX2080TI().price
            Glide.with(view).load(RTX2080TI().image).into(view.findViewById(R.id.iVProduct24))
            view.findViewById<Button>(R.id.cartBuyButton3).visibility= View.VISIBLE
        }
        view.findViewById<Button>(R.id.cartBuyButton1).setOnClickListener {
            this.context?.let {it2-> MyDialog2(it2).show() }
            Navigation.findNavController(view).navigate(CartFragmentDirections.actionNotificationFragmentToHomeFragment())
        }
        view.findViewById<Button>(R.id.cartBuyButton2).setOnClickListener {
            this.context?.let {it2-> MyDialog2(it2).show() }
            Navigation.findNavController(view).navigate(CartFragmentDirections.actionNotificationFragmentToHomeFragment())
        }
        view.findViewById<Button>(R.id.cartBuyButton3).setOnClickListener {
            this.context?.let {it2-> MyDialog2(it2).show() }
            Navigation.findNavController(view).navigate(CartFragmentDirections.actionNotificationFragmentToHomeFragment())
        }
    }
}
