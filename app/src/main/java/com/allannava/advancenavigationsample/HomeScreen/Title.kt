package com.allannava.advancenavigationsample.HomeScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.allannava.advancenavigationsample.BaseActivity.BaseFragment
import com.allannava.advancenavigationsample.R

/**
 * Created by Allan Nava on 21/04/2021.
 * Updated by Allan Nava on 21/04/2021.
 */
class Title : BaseFragment(), HomeScreenContracts.View {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_title, container, false)
        return view
    }
}