package com.example.a14tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager:ViewPager = findViewById(R.id.viewPager)
        val tabLayout:TabLayout = findViewById(R.id.tabLayout)

        val fragmentAdapter = fragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(homeFragment(),"Home")
        fragmentAdapter.addFragment(chatFragment(),"Chat")
        fragmentAdapter.addFragment(settingFragment(),"Setting")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}