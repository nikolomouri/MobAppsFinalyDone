package com.example.mobappsfinallydone.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mobappsfinallydone.fragments.HomeFragment2
import com.example.mobappsfinallydone.fragments.HomeFragment3
import com.example.mobappsfinallydone.fragments.HomeFragmentMain

class ViewPagerAdapterFragments(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> HomeFragmentMain()
            1->HomeFragment2()
            2->HomeFragment3()
            else -> HomeFragmentMain()
        }
    }
}