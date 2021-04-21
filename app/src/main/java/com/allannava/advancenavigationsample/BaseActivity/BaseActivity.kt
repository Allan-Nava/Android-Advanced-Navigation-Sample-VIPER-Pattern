package com.allannava.advancenavigationsample.BaseActivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Allan Nava on 21/04/2021.
 * Updated by Allan Nava on 21/04/2021.
 */

interface BaseOnActivityResult {
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}

abstract class BaseActivity : AppCompatActivity(), BaseContracts.View {

    override fun getActivityContext(): Context? {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

}