package com.yoesuv.mycoroutinesnetworking.utils

import android.util.Log
import com.yoesuv.mycoroutinesnetworking.BuildConfig
import com.yoesuv.mycoroutinesnetworking.Constants

fun logDebug(message: String) {
    if (BuildConfig.DEBUG) Log.d(Constants.TAG_DEBUG, message)
}

fun logError(message: String) {
    if (BuildConfig.DEBUG) Log.e(Constants.TAG_ERROR, message)
}