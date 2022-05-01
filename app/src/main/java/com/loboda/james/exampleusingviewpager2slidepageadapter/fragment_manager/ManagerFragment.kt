package com.loboda.james.exampleusingviewpager2slidepageadapter.fragment_manager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.loboda.james.exampleusingviewpager2slidepageadapter.R
import com.loboda.james.exampleusingviewpager2slidepageadapter.adapters.ScreenSlidePageAdapter
import com.loboda.james.exampleusingviewpager2slidepageadapter.databinding.FragmentManagerBinding
import com.loboda.james.testvariety1.page_transformers.ZoomOutPageTransformer

class ManagerFragment : Fragment() {

    private lateinit var binding: FragmentManagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = activity?.getString(R.string.fragmanager)
        binding = FragmentManagerBinding.inflate(inflater, container, false)

        binding.apply {

            // pager adapter
            val pagerAdapter = ScreenSlidePageAdapter(this@ManagerFragment)
            viewPager.adapter = pagerAdapter
            viewPager.setPageTransformer(ZoomOutPageTransformer())

        }

        return binding.root
    }
}