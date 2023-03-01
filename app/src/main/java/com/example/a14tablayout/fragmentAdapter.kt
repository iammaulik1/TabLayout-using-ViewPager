package com.example.a14tablayout

import android.icu.text.CaseMap.Title
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class fragmentAdapter (fm:FragmentManager):FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    var fragmentlist :ArrayList<Fragment> = ArrayList()
    var fragmenttitle : ArrayList<String> = ArrayList()


    override fun getCount(): Int {
        return fragmentlist.size
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0->{
                return homeFragment()
            }
            1 -> {
                return chatFragment()
            }
            2-> {
                return settingFragment()
            }
        }
        return fragmentlist[position]

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmenttitle[position]
    }

    fun addFragment(fragment: Fragment,title: String){
        fragmentlist.add(fragment)
        fragmenttitle.add(title)
    }

}