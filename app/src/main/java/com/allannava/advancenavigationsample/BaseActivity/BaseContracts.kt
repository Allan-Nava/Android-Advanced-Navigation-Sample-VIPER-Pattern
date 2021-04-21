package com.allannava.advancenavigationsample.BaseActivity

import android.app.Activity
import android.content.Context
import android.os.Bundle

/**
 * Created by Allan Nava on 21/04/2021.
 * Updated by Allan Nava on 21/04/2021.
 */
object BaseContracts {

    interface View {
        fun getActivityContext(): Context?
    }

    interface Presenter {
        fun onCreate(bundle: Bundle? = null) {}
        fun onResume() {}
        fun onPause() {}
        fun onDestroy()
    }

    interface Interactor {
        fun unregister()
    }

    interface InteractorOutput //does nothing for now

    interface Router {
        var activity: Activity?
        fun unregister()
    }

}