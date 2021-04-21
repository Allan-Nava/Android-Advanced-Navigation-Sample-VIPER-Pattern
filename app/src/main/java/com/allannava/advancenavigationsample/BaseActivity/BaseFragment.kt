package com.allannava.advancenavigationsample.BaseActivity

import android.content.Context
import android.content.ContextWrapper
import androidx.fragment.app.Fragment

/**
 * Created by Allan Nava on 21/04/2021.
 * Updated by Allan Nava on 21/04/2021.
 */
abstract class BaseFragment : Fragment(),  BaseContracts.View {

    fun getBaseActivity():  BaseActivity? {
        var context = context
        while (context is ContextWrapper) {
            if (context is  BaseActivity) {
                return context
            }
            context = context.baseContext
        }
        return null
    }

    override fun getActivityContext(): Context? {
        return getBaseActivity()
    }

}