package com.allannava.advancenavigationsample.ListScreen

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
class LeaderBoard :  BaseFragment(), ListScreenContracts.View  {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_leaderboard, container, false)
        return view
    }
}