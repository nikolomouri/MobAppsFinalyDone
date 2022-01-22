package com.example.mobappsfinallydone.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.mobappsfinallydone.R
import com.example.mobappsfinallydone.adapters.ViewPagerAdapterFragments
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment:Fragment(R.layout.home_fragment) {    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerAdapter: ViewPagerAdapterFragments
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewPager2 = view.findViewById(R.id.viewPagerFragments)
        tabLayout = view.findViewById(R.id.tabLayout)
        viewPagerAdapter = ViewPagerAdapterFragments(this.context as FragmentActivity)
        viewPager2.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout, viewPager2){tab, position->
            when(position){
                0->tab.text = "GTX 10th series"
                1->tab.text = "RTX 20th series"
                2->tab.text = "RTX 30th series"
            }
        }.attach()
    }
}