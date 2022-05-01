package com.loboda.james.exampleusingviewpager2slidepageadapter.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.loboda.james.exampleusingviewpager2slidepageadapter.fragments.OneFragment
import com.loboda.james.exampleusingviewpager2slidepageadapter.fragments.ThreeFragment
import com.loboda.james.exampleusingviewpager2slidepageadapter.fragments.TwoFragment

/**
 * @author James Loboda aka papayev
 * created by James Loboda aka papayev at 5/1/22
 * www.papayev.com
 */

class ScreenSlidePageAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {

    val fragments = listOf(OneFragment(), TwoFragment(), ThreeFragment())

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}