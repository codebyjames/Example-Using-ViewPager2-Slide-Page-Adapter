package com.loboda.james.exampleusingviewpager2slidepageadapter.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.loboda.james.exampleusingviewpager2slidepageadapter.R

/**
 * @author James Loboda aka papayev
 * created by James Loboda aka papayev at 5/1/22
 * www.papayev.com
 */
class TwoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}